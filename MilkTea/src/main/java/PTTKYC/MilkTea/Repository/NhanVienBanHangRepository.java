package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.NhanVienBanHang;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienBanHangRepository extends PagingAndSortingRepository< NhanVienBanHang, Integer > {
}
