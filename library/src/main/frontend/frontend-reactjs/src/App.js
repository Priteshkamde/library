import './App.css';

import NavigationBar from './components/NavigationBar'
import Welcome from './components/Welcome'
import Book  from './components/Book'
import BookList from './components/BookList'

import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'

function App() {
  return (
    <Router>
    <NavigationBar />
        <Switch>
          <Route path="/" exact component={Welcome} />
          <Route path="/add" exact component={Book} />
          <Route path="/list" exact component={BookList} />
        </Switch>
    </Router>
  );
}

export default App;
