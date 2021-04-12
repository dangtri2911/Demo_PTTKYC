package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.SanPham;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends PagingAndSortingRepository< SanPham,Integer >{
    List<SanPham> findAllByOrderByIDDesc();
    List<SanPham> findAllByTinhTrangOrderByIDDesc(int tinhTrang);
}
