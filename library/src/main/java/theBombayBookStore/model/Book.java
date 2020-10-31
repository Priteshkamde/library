package theBombayBookStore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "AllBooks")
public class Book {

    @Id
    private String id;
    private String name;
    private String author;
    private int price;
    private int rating;

    private List<Review> reviews;

    public Book() {}

//    public Book(){
//        this.reviews = new ArrayList<>();
//    }

    public Book(String name, String author, int price, int rating) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.rating = rating;
//        this.reviews = reviews;
    }

    public Book(String id, String name, String author, int price, int rating) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.rating = rating;
//        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", reviews=" + reviews +
                '}';

    }
}
