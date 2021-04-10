package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.ThuKho;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuKhoRepository extends PagingAndSortingRepository< ThuKho,Long > {
}
