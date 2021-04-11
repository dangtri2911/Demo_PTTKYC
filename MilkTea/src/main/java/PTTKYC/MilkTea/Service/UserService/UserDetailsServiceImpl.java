package PTTKYC.MilkTea.Service.UserService;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
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
    private TaiKhoanRepository taiKhoanRepository;
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      for(TaiKhoan i: taiKhoanRepository.findAll()){
          if(i.getUsername() == s){
              return i;
          }
      }
        List< GrantedAuthority > authorities = AuthorityUtils.createAuthorityList( "ROLE_USER" );
        return  new TaiKhoan("demo","123456");
    }
}
