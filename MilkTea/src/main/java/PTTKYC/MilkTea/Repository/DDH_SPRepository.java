package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Product.DDH_SP;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DDH_SPRepository extends PagingAndSortingRepository< DDH_SP,Integer > {
}
