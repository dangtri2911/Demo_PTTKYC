package PTTKYC.MilkTea.Service.FacebookService;

import PTTKYC.MilkTea.Entity.User;
import PTTKYC.MilkTea.Repository.UserRepository;
import PTTKYC.MilkTea.Service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.stereotype.Service;

@Service
public class FacebookConnectionSignup implements ConnectionSignUp {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @Override
    public String execute(Connection< ? > connection) {
        User user = new User();
        user.setUsername(connection.getDisplayName());
        user.setPassword("123456");
        userService.save(user);
        return user.getUsername();
    }
}
