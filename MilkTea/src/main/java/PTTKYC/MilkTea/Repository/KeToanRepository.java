package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.KeToan;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeToanRepository extends PagingAndSortingRepository< KeToan, Long > {
}
