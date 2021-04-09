package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.QuanLyCuaHang;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuanLyCuaHangRepository extends PagingAndSortingRepository< QuanLyCuaHang, Integer > {
}
