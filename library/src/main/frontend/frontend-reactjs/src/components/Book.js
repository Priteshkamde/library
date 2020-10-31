import React, { Component } from 'react'
import { BookToast } from './BookToast'
import { Container, Form, Button, Row, Col } from 'react-bootstrap'
import axios from 'axios';

export default class Book extends Component {


    constructor(props) {
        super(props);

        this.state = this.initialState
        this.bookChange = this.bookChange.bind(this)
        this.submitBook = this.submitBook.bind(this)         
    }

    initialState = {
        book_name:'', 
        author_name : '',
        book_price : '',
        book_rating : ''
    }

    resetBook = () => {
        this.setState( () => this.initialState );
    }

    submitBook = event => {
 
        event.preventDefault();

        const book = {
            name : this.state.book_name,
            author : this.state.author_name,
            price : this.state.book_price,
            rating : this.state.book_rating 
        };

        axios.post("http://localhost:8999/bookstore/add", book)
        .then(response => {
            console.log(book)
            if( response.data != null ) {
                this.setState(this.initialState);
                alert("book saved successfully");
            }
        });
    }

    bookChange = event => {
        this.setState( {
            [event.target.name]:event.target.value
        } );
    }

    render() {
        const { book_name, author_name, book_price, book_rating } = this.state;

        return (

            
            <div>
                <Container>
                <h1 className="display-3 mb-4">
                    Add Book
                </h1>
                </Container>

                <Container>
                {/* <Row className=""> */}
                <Form 
                    onReset={this.resetBook}
                    onSubmit={this.submitBook}
                    id="bookFormId"
                >
                    <Form.Row>
                        <Form.Group 
                        as={Col} md={12}
                        controlId="formGridName"
                        >
                            <Form.Label>
                                Name
                            </Form.Label>
                            <Form.Control 
                            required autoComplete="off"
                            type="text" 
                            name="book_name"
                            placeholder="Enter Book Name"
                            value={book_name}
                            onChange={this.bookChange}
                            />
                        </Form.Group>
                    </Form.Row>

                    <Form.Row>
                        <Form.Group as={Col}
                        controlId="formGridAuthor"
                        >
                            <Form.Label>
                                Author
                            </Form.Label>
                            <Form.Control 
                            required autoComplete="off"
                            type="text" 
                            name="author_name"
                            placeholder="Enter Author Name" 
                            value={author_name}
                            onChange={this.bookChange}
                            />
                        </Form.Group>
                    </Form.Row>

                    <Form.Row>
                        <Form.Group as={Col}
                        controlId="formGridPrice"
                        >
                            <Form.Label>
                                Price
                            </Form.Label>
                            <Form.Control 
                            required autoComplete="off"
                            type="number" 
                            name="book_price" 
                            placeholder="Enter Price" 
                            value={book_price}
                            onChange={this.bookChange}
                            />
                        </Form.Group>
                    </Form.Row>

                    <Form.Row>
                        <Form.Group as={Col}
                        controlId="formGridPublished"
                        >
                            <Form.Label>
                                Rating
                            </Form.Label>
                            <Form.Control 
                            required autoComplete="off"
                            type="number" 
                            name="book_rating" 
                            placeholder="Enter Rating"
                            value={book_rating}
                            onChange={this.bookChange} 
                            />
                        </Form.Group>
                    </Form.Row>

                    
                        {/* <Form.Text className="text-muted">
                        We'll never share your email with anyone else.
                        </Form.Text> */}

                    <Button variant="dark" type="submit">
                        Submit
                    </Button>
                    { ' ' }
                    <Button variant="secondary" type="reset">
                        Reset
                    </Button>
                </Form>
                {/* </Row> */}
                </Container>
            </div>
        );
    }
}
