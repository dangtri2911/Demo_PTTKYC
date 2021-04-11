package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.KhachHangRepository;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RegisterController {
    @Autowired
    UserService userService;
    @Autowired
    TaiKhoanRepository taiKhoanRepository;
    @Autowired
    KhachHangRepository khachHangRepository;
}
