import React, { Component } from 'react'

import { Card, Button, Container, Table } from 'react-bootstrap'

import axios from 'axios';

export default class BookList extends Component {


    constructor(props) {
        super(props);
        this.state = {
            books : []
        };
    }

    componentDidMount() {
       this.findAllBooks()
    }

    findAllBooks() {
         axios.get("http://localhost:8999/bookstore/all")
        .then(response => response.data)
        .then((data) => {
            this.setState({ books : data });
        });
    }

    render() {
            
        return (
             <div>
                <Container>
                
                <h1 className="display-3 mb-4">
                    Book List
                </h1>

                <Table borderless responsive hover striped variant="light">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                            <th>Author</th>
                            <th>Price</th>
                            <th>Rating</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.books.map((book)=> (
                                <tr key={book.id}>
                                    <td>
                                        { '#' }
                                    </td>
                                    <td> 
                                        {book.name}
                                    </td>
                                    <td> 
                                        {book.author}
                                    </td>
                                    <td> 
                                        {book.price}
                                    </td>
                                    <td> 
                                        {book.rating}
                                    </td>
                                </tr>
                            )) 
                        }
                    </tbody>
                </Table>
                <kbd>
                    {this.state.books.length} Books Available
                </kbd>
                </Container>
             </div>
        );
    }
}