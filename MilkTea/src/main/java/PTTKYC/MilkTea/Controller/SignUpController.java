package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Config.SecurityConfig;
import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SignUpController{
    @Autowired
    UserService userService;
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @GetMapping("/signup")
    public String signup_page(){
        return "signup";
    }
    @PostMapping("/signup")
    public String signUp(@RequestParam("userName") String userName,
                         @RequestParam("password1") String password1,
                         @RequestParam("password2") String password2,
                         Model model){
        if(!taiKhoanRepository.findByusername(userName).isEmpty()){
            model.addAttribute("Existed",true);
            return "signup";
        }
        if(!password1.equals(password2)){
            model.addAttribute("wrongPass",true);
            return "signup";
        }
        TaiKhoan taiKhoan = new TaiKhoan(userName,password1);
        taiKhoan.getAuthorities();
        userService.save(taiKhoan);
        model.addAttribute("signup_success",true);
        return "login";
    }
    /*
    @GetMapping("/demoFB")
    public String demoFB(){
        return "demofb";
    }
     */
}
