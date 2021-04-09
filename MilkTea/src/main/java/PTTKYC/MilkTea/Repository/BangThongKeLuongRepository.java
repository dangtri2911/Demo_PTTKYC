package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Product.BangThongKeLuong;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BangThongKeLuongRepository extends PagingAndSortingRepository< BangThongKeLuong, Integer > {
}
