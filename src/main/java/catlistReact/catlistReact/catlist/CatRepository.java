//Spring Data JPA focuses on using JPA to store data in a relational database. Its most
//        compelling feature is the ability to create repository implementations automatically,
//        at runtime, from a repository interface.

package catlistReact.catlistReact.catlist;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface CatRepository extends CrudRepository<Cat, Long> {
    List<Cat> findByName(String name);

    Cat findById(long id);
}
d