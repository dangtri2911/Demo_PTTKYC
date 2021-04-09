package PTTKYC.MilkTea.Service.FacebookService;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {
    @Autowired
    TaiKhoanRepository taiKhoanRepository;
    @Autowired
    UserService userService;
    @Override
    public String execute(Connection< ? > connection) {
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setUsername(connection.getDisplayName());
        taiKhoan.setPassword("123456");
        userService.save(taiKhoan);
        return taiKhoan.getUsername();
    }
}
