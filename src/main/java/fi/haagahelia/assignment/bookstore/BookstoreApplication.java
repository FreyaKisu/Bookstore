package fi.haagahelia.assignment.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.assignment.bookstore.domain.Book;
import fi.haagahelia.assignment.bookstore.domain.BookstoreRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner createBookData(BookstoreRepository repository) {
		return (args) -> {
			System.out.println("saving books");
			repository.save(new Book("ABC", "John Doe", 1988, 99, 10));

		};
	}

}
