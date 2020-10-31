package theBombayBookStore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import theBombayBookStore.model.Book;
import theBombayBookStore.model.Review;
import theBombayBookStore.repository.BookRepository;

import java.util.Arrays;

//@DataMongoTest
@SpringBootTest
class LibraryApplicationTests {

//	@Autowired
//	BookRepository bookRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void testBooks() {

		Book bookObject = new Book(
				"5f6ded34d2e5740be10e4a17",
				"The Power of Mind",
				"SV",
				400,
				9
//				Arrays.asList(
//						new Review("Chandler", 9, true)
//				)
		);

		Book b = new Book();
//		b.setId("5f6ded34d2e5740be10e4a17");
		b.setAuthor("SV");
		b.setName("The Power of Mind");
		b.setPrice(400);
		b.setRating(7);
//		b.setReviews(Arrays.asList(new Review("Chandler", 9, true)));


		Assertions.assertEquals(400,b.getPrice());
		Assertions.assertEquals("SV",b.getAuthor());
		Assertions.assertEquals("The Power of Mind", b.getName());

	}

}

