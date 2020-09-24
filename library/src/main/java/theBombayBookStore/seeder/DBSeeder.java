package theBombayBookStore.seeder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import theBombayBookStore.model.Book;
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

        Book fountainhead = new Book(
                "The FountainHead",
                "Ayn Rand",
                200,
                true
        );
        Book thesecret = new Book(
                "The Secret",
                "Rhonda Bryne",
                500,
                true
        );
        Book powerofmind = new Book(
                "The Power of Mind",
                "SV",
                400,
                true
        );

        this.bookRepository.deleteAll();
//        this.bookRepository.save(fountainhead);
//        this.bookRepository.save(thesecret);

        List<Book> allBooks = Arrays.asList(fountainhead, thesecret, powerofmind);
        bookRepository.saveAll(allBooks);

    }
}
