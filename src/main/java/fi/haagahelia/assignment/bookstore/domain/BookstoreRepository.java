package fi.haagahelia.assignment.bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


	public interface BookstoreRepository extends CrudRepository<Book, Long> {

	    List<Book> findByTitle(String title);
	    
	}

