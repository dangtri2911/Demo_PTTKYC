package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Product.Luong;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuongRepository extends PagingAndSortingRepository< Luong, Integer > {
}
