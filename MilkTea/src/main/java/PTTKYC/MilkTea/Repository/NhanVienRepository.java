package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.NhanVien;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends PagingAndSortingRepository< NhanVien, Integer > {
}
