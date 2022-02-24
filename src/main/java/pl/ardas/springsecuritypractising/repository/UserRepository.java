package pl.ardas.springsecuritypractising.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ardas.springsecuritypractising.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
