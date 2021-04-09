package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.KhachHang;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends PagingAndSortingRepository< KhachHang,Integer > {
}
