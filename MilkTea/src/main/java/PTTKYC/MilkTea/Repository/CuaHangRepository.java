package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.CuaHang;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuaHangRepository extends PagingAndSortingRepository< CuaHang,Integer > {
}
