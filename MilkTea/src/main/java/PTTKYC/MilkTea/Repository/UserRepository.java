package PTTKYC.MilkTea.Repository;

import PTTKYC.MilkTea.Entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository< User,Long > {
    Optional<User> findByusername(String userName);
}
