package fi.haagahelia.assignment.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.assignment.bookstore.domain.Book;
import fi.haagahelia.assignment.bookstore.domain.BookstoreRepository;
import fi.haagahelia.assignment.bookstore.domain.Category;


@RunWith(SpringRunner.class)
@DataJpaTest

public class BookRepositoryTest {

	@Autowired
	private BookstoreRepository repository;

	@Test
	public void findByLastnameShouldReturnStudent() {
		List<Book> books = repository.findByTitle("ABC... how to read?");

		assertThat(books).hasSize(1);
		assertThat(books.get(0).getYear()).isEqualTo(1989);
	}

	@Test
	public void createNewBook() {
		Book book = new Book("ABC", "John Doe",2001, 99, 10, new Category("Mystery"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}

}
