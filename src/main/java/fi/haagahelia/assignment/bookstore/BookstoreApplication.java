package fi.haagahelia.assignment.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.assignment.bookstore.domain.Book;
import fi.haagahelia.assignment.bookstore.domain.BookstoreRepository;
import fi.haagahelia.assignment.bookstore.domain.Category;
import fi.haagahelia.assignment.bookstore.domain.CategoryRepository;


@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner createBookData(BookstoreRepository bookRepository, CategoryRepository categoryRepository) {
		return (args) -> {
			System.out.println("saving books");
//			Category mystery = new Category();
//			mystery.setName("Mystery");
//			categoryRepository.save(mystery);
//			Category horror = new Category();
//			horror.setName("Horror");
//			categoryRepository.save(horror);
			
			categoryRepository.save(new Category("Mystery"));
			categoryRepository.save(new Category("Horror"));
			bookRepository.save(new Book("ABC... how to read?", "John Doe", 1988, 99, 10, categoryRepository.findByName("Mystery").get(0)));
			bookRepository.save(new Book("ABC... learn to read or die!", "John Doe", 1988, 99, 10, categoryRepository.findByName("Horror").get(0)));
			bookRepository.save(new Book("ABC... when the server doesn't start, nervous breakdown", "John Doe", 1988, 99, 10, categoryRepository.findByName("Horror").get(0)));

			log.info("fetch all books");
			for (Book book : bookRepository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
