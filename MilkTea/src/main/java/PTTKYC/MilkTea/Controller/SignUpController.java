package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Config.SecurityConfig;
import PTTKYC.MilkTea.Entity.User;
import PTTKYC.MilkTea.Repository.UserRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class SignUpController{
    @Autowired
    UserService userService;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test/{username}/{password}")
    public String test(Model model,
                       @PathVariable("username") String username,
                       @PathVariable("password") String password,
                       HttpServletResponse response) throws IOException {
        User user  = new User(username,password);
        user.getAuthorities();
        userService.save(user);
        response.sendRedirect("/login");
        return "login";
    }

    @GetMapping("/signup")
    public String signup_page(){
        return "signup";
    }
    @PostMapping("/signup")
    public String signUp(@RequestParam("userName") String userName,
                         @RequestParam("password1") String password1,
                         @RequestParam("password2") String password2,
                         Model model){
        if(!userRepository.findByusername(userName).isEmpty()){
            model.addAttribute("Existed",true);
            return "signup";
        }
        if(!password1.equals(password2)){
            model.addAttribute("wrongPass",true);
            return "signup";
        }
        User user  = new User(userName,password1);
        user.getAuthorities();
        userService.save(user);
        model.addAttribute("signup_success",true);
        return "login";
    }
    @GetMapping("/demoFB")
    public String demoFB(){
        return "demofb";
    }
}
