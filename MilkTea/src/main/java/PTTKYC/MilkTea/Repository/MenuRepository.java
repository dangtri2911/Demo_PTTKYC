package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends PagingAndSortingRepository< Menu,Integer> {
}
