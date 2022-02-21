package pl.ardas.springsecuritypractising.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ardas.springsecuritypractising.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByUsername(String username);
}
