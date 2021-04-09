package PTTKYC.MilkTea.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeToan extends PagingAndSortingRepository<KeToan, Long > {
}
