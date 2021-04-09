package PTTKYC.MilkTea.Service.Impl;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRepositoryImpl {
    @Autowired
    TaiKhoanRepository taiKhoanRepository;

    Optional< TaiKhoan > findByUserName(String userName){
        Optional< TaiKhoan > val = Optional.empty();
        for(TaiKhoan i: taiKhoanRepository.findAll()){
            if(i.getUsername().equals(userName)){
                val = Optional.of(i);
                return val;
            }
        }
        return  val;
    }

}
