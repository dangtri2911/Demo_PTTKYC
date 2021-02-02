package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Entity.User;
import PTTKYC.MilkTea.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      for(User i:userRepository.findAll()){
          if(i.getUsername() == s){
              return i;
          }
      }
        List< GrantedAuthority > authorities = AuthorityUtils.createAuthorityList( "ROLE_USER" );

        return  new User("demo","123456");
    }
}
