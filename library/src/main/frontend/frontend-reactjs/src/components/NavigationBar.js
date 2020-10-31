import React, { Component } from 'react'

import {Navbar, Nav, Button} from 'react-bootstrap'
import { Link } from 'react-router-dom'

class NavigationBar extends Component {
    render() {
        return (
                <div>
                    <Navbar bg="light" variant="light">

                        <Link to={""} className="navbar-brand">
                            Book Store
                        </Link>

                        <Nav className="mr-auto">
                            <Link to={"add"} className="nav-link">
                                Add
                            </Link>
                            <Link to={"list"} className="nav-link">
                                List
                            </Link>
                        </Nav>
                        
                    </Navbar>
                </div>
        );
    }
}

export default NavigationBar;