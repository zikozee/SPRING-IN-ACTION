package tacos.repository;

import org.springframework.data.repository.CrudRepository;
import tacos.domain.User;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 May 2023
 */

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
