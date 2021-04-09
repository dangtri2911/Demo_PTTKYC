package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.model.Interface.ThuKho;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuKhoRepository extends PagingAndSortingRepository< ThuKho,Long > {
}
