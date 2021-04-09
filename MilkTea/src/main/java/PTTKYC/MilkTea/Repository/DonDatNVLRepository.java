package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Product.DonDatNVL;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonDatNVLRepository extends PagingAndSortingRepository< DonDatNVL, Integer > {
}
