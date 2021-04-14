package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Config.SecurityConfig;
import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AccountController {
    private final TaiKhoanRepository taiKhoanRepository;
    private final UserService userService;
    private final SecurityConfig securityConfig;

    public AccountController(TaiKhoanRepository taiKhoanRepository, UserService userService, SecurityConfig securityConfig) {
        this.taiKhoanRepository = taiKhoanRepository;
        this.userService = userService;
        this.securityConfig = securityConfig;
    }

    @GetMapping("/admin/edit/account/disable/{id}")
    public String disableAccounts(@PathVariable("id") int id,
                                  Model model,
                                  HttpServletResponse response) throws IOException {
        TaiKhoan user = taiKhoanRepository.findById(id).get();
        user.setActive(false);
        securityConfig.getUserDetailsManager().updateUser(user);
        taiKhoanRepository.save(user);
        response.sendRedirect("/admin/edit/account/disableStatus=True");
        return "index";
    }
    @GetMapping("/admin/edit/account/disableStatus=True")
    public String disableAccountSuccess(Model model){
        model.addAttribute("info",true);
        model.addAttribute("message","Vô hiệu hóa tài khoản thành công");
        model.addAttribute("accounts",taiKhoanRepository.findAll());
        return "manage_account";
    }
    @GetMapping("/admin/edit/account/enable/{id}")
    public String enableAccounts(@PathVariable("id") int id,
                                  Model model,
                                  HttpServletResponse response) throws IOException {
        TaiKhoan user = taiKhoanRepository.findById(id).get();
        user.setActive(true);
        securityConfig.getUserDetailsManager().updateUser(user);
        taiKhoanRepository.save(user);
        response.sendRedirect("/admin/edit/account/enableStatus=True");
        return "index";
    }
    @GetMapping("/admin/edit/account/enableStatus=True")
    public String enableAccountSuccess(Model model){
        model.addAttribute("info",true);
        model.addAttribute("message","Kích hoạt tài khoản thành công");
        model.addAttribute("accounts",taiKhoanRepository.findAll());
        return "manage_account";
    }
}
