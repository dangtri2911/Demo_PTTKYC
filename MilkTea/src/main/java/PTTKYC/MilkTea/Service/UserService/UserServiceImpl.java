package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Config.SecurityConfig;
import PTTKYC.MilkTea.Entity.User;
import PTTKYC.MilkTea.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private SecurityConfig securityConfig;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        user.setPassword(securityConfig.bCryptPasswordEncoder().encode(user.getPassword()));
        user.getAuthorities();
        securityConfig.getUserDetailsManager().createUser(user);
        userRepository.save(user);
    }

    @Override
    public void changeUserPassword(User user, String password) {

    }

    @Override
    public Optional< User > findByUsername(String username) {
        return Optional.empty();
    }
}
