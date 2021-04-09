package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.SanPham;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends PagingAndSortingRepository< SanPham,Long >{
}
