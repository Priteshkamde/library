package theBombayBookStore.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import theBombayBookStore.model.Book;
import theBombayBookStore.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bookstore")

public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/all")
    public List<Book> getAll(){
        List<Book> books = this.bookRepository.findAll();
        return books;
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getByID(@PathVariable("id") String id ){
        Optional<Book> book = this.bookRepository.findById(id);

        if (book.isPresent()){
            return new ResponseEntity<Book>(book.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/books")
    public ResponseEntity<HttpStatus> delAll(){
        try {
            this.bookRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }   catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/books/by/{author}")
    public Optional<Book> getByAuthor(@PathVariable("author") String author){
        Optional<Book> book = this.bookRepository.findByAuthor(author);

        return book;
    }


 }



