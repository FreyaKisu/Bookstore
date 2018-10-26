package fi.haagahelia.assignment.bookstore;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.haagahelia.assignment.bookstore.web.BookstoreController;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SmokeTest {
	@Autowired
	private BookstoreController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
