package PTTKYC.MilkTea.Service.Impl;

import PTTKYC.MilkTea.Entity.User;
import PTTKYC.MilkTea.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRepositoryImpl {
    @Autowired
    UserRepository userRepository;

    Optional< User > findByUserName(String userName){
        Optional<User> val = Optional.empty();
        for(User i:userRepository.findAll()){
            if(i.getUsername().equals(userName)){
                val = Optional.of(i);
                return val;
            }
        }
        return  val;
    }

}
