package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Entity.TaiKhoan;

import java.util.Optional;

public interface UserService {
    void save(TaiKhoan taiKhoan);
    void changeUserPassword(TaiKhoan taiKhoan, String password);
    Optional< TaiKhoan > findByUsername(String username);
}
