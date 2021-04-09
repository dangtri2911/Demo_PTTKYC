package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.NVL;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NVLRepository extends PagingAndSortingRepository< NVL, Integer > {
}
