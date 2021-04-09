package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.TaiKhoan;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TaiKhoanRepository extends PagingAndSortingRepository< TaiKhoan,Long > {
    Optional< TaiKhoan > findByusername(String userName);
}
