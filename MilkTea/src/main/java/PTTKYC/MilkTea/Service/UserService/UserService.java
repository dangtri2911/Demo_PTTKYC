package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Entity.User;

import java.util.Optional;

public interface UserService {
    void save(User user);
    void changeUserPassword(User user, String password);
    Optional<User> findByUsername(String username);
}
