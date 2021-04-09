package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Config.SecurityConfig;
import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public void save(TaiKhoan taiKhoan) {
        taiKhoan.setPassword(securityConfig.bCryptPasswordEncoder().encode(taiKhoan.getPassword()));
        taiKhoan.getAuthorities();
        securityConfig.getUserDetailsManager().createUser(taiKhoan);
        taiKhoanRepository.save(taiKhoan);
    }

    @Override
    public void changeUserPassword(TaiKhoan taiKhoan, String password) {

    }

    @Override
    public Optional< TaiKhoan > findByUsername(String username) {
        return Optional.empty();
    }
}
