package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.Food;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends PagingAndSortingRepository< Food,Long > {
}
