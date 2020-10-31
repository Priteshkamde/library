import React, { Component } from 'react'

import { Button, Jumbotron } from 'react-bootstrap'


export default class Welcome extends Component {
    render() {
        return (
                <div>
                    <Jumbotron>
                        <p className="text-dark text-transp-effect">
                            <h1 className="display-3 mb-4">Bombay Book Store</h1>
                        </p>
                        <p>
                            <Button variant="dark">Learn more</Button>
                        </p>
                    </Jumbotron>
                </div>
        );
    }
}

