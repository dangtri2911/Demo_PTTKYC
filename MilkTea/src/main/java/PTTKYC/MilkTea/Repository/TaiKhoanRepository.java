package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaiKhoanRepository extends PagingAndSortingRepository< TaiKhoan, Integer > {
    Optional< TaiKhoan > findByusername(String userName);
}
