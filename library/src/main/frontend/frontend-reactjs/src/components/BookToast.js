import React, { Component } from 'react'

import { Toast } from 'react-bootstrap'


export default class BookToast extends Component {
    render() {

        const ToastCss = {
            position : 'fixed',
            top : '20px',
            right : '20px',
        };

        return (
            <div style={ToastCss}>
            <Toast className={"border border-success"}>
                <Toast.Header className={"bg-dark text-light"}>
                    <strong className="mr-auto">Success</strong>
                </Toast.Header>
                <Toast.Body>
                    Book Saved Successfully !
                </Toast.Body>
            </Toast>
            </div>
        );
    };
}