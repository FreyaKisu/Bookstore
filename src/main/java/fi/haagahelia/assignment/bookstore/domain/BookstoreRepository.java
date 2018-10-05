package fi.haagahelia.assignment.bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface BookstoreRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(@Param("title")String title);

}
