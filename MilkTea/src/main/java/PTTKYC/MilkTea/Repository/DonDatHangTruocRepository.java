package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.DonDatHangTruoc;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonDatHangTruocRepository extends PagingAndSortingRepository< DonDatHangTruoc,Integer > {
}
