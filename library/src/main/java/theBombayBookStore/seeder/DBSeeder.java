package theBombayBookStore.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import theBombayBookStore.model.Book;
import theBombayBookStore.model.Review;
import theBombayBookStore.repository.BookRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private BookRepository bookRepository;

    public DBSeeder(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Each Time DB resets
        this.bookRepository.deleteAll();

        Book fountainhead = new Book(
                "The FountainHead",
                "Ayn Rand",
                200,
                9
//                Arrays.asList(
//                        new Review("Chandler", 10, true),
//                        new Review("Ross", 10, true)
//                )
        );
        Book thesecret = new Book(
                "The Secret",
                "Rhonda Bryne",
                500,
                9
//                Arrays.asList(
//                        new Review("Chandler", 5, true),
//                        new Review("Ross", 9, true)
//                )
        );

        Book powerofmind = new Book(
                "The Power of Mind",
                "SV",
                400,
                9
//                Arrays.asList(
//                        new Review("Chandler", 9, true)
//                )
        );

        Book physics = new Book(
                "The Physics",
                "Albert Einstein",
                500,
                10
//                Arrays.asList(
//                        new Review("Chandler", 9, true)
//                )
        );

//        this.bookRepository.save(fountainhead);
//        this.bookRepository.save(thesecret);

        List<Book> allBooks = Arrays.asList(fountainhead, thesecret, powerofmind, physics);
        bookRepository.saveAll(allBooks);

    }
}
