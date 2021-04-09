package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.KhoNVL;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoNVLRepository extends PagingAndSortingRepository< KhoNVL, Integer > {
}
