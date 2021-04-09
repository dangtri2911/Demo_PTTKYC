package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Product.BaoCao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaoCaoRepository extends PagingAndSortingRepository< BaoCao, Integer > {

}
