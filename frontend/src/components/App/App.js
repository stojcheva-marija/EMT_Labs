import './App.css';
import React, {Component} from "react";
import {BrowserRouter as Router, Navigate, Route, Routes} from 'react-router-dom'
import Authors from '../Authors/authors';
import Countries from '../Countries/countries'
import Books from '../Books/BookList/books'
import BookAdd from '../Books/BookAdd/bookAdd'
import BookEdit from "../Books/BookEdit/bookEdit";
import Categories from '../Categories/categories'
import Header from '../Header/header'
import LibraryService from "../../repository/libraryRepository";


class App extends Component{

    constructor(props) {
        super(props);
        this.state = {
            authors: [],
            countries : [],
            books : [],
            categories : [],
            selectedBook : {} //objekt

        }
        console.log("constrtor")

    }

    render() {
        return(
            <Router>
                <Header/>
                <main>
                    <header>
                        <div className="container">
                            <Routes>
                                <Route path={"/authors"} exact element={
                                    <Authors authors={this.state.authors}/>}/>
                                {/*gi redime po specificnost*/}
                                <Route path={"/books/add"} exact element={
                                    <BookAdd categories={this.state.categories} authors={this.state.authors} onAddBook={this.addBook}/>}/>
                                {/*//:id varijabilen del vo rutata*/}
                                <Route path={"/books/edit/:id"} exact element={
                                    <BookEdit categories={this.state.categories} authors={this.state.authors} onEditBook={this.editBook} book={this.state.selectedBook}/>}/>
                                <Route path={"/books"} exact element={
                                    <Books books={this.state.books} onDelete={this.deleteBook} onEdit={this.getBook} onMark={this.markBook}/>}/>
                                <Route path={"/countries"} exact element={
                                    <Countries countries={this.state.countries}/>}/>
                                <Route path={"/categories"} exact element={
                                    <Categories categories={this.state.categories}/>}/>
                                <Route path="/" element={<Navigate replace to="/books"/>}/>
                            </Routes>
                        </div>
                    </header>
                </main>
            </Router>

        );
    } //2 step posle controler i na update

    loadAuthors = () => {
        LibraryService.fetchAuthors()
            .then((data) => {
                this.setState({

                    authors: data.data
                    //datata vo objektot data
                });
            });
    }

    loadBooks = () => {
        LibraryService.fetchBooks()
            .then((data) => {
                this.setState({
                    books: data.data
                    //datata vo objektot data
                });
            });
    }

    loadCountries = () => {
        LibraryService.fetchCountries()
            .then((data) => {
                this.setState({
                    countries: data.data
                    //datata vo objektot data
                });
            });
    }

    loadCategories = () => {
        LibraryService.fetchCategories()
            .then((data) => {
                this.setState({
                    categories: data.data
                    //datata vo objektot data
                });
            });
    }

    deleteBook = (id) => {
        LibraryService.deleteBook(id)
            .then(() => {
                this.loadBooks();
            })
    }

    addBook = (name, category, author, availableCopies) => {
        LibraryService.addBook(name, category, author, availableCopies)
            .then(() => {
                this.loadBooks();
            })
    }

    getBook = (id) => {
        LibraryService.getBook(id)
            .then((data) => {
                this.setState({
                    selectedBook : data.data
                })
            })
    }

    editBook = (id, name, category, author, availableCopies) => {
        LibraryService.editBook(id, name, category, author, availableCopies)
            .then(() => this.loadBooks())
    }

    markBook = (id) => {
        LibraryService.markBookAsTaken(id)
            .then(() => {
                this.loadBooks()
            });
    }

    componentDidMount() {
        this.loadAuthors();
        this.loadBooks();
        this.loadCountries();
        this.loadCategories();
        console.log("tuka")
    }//3 step posle controler

}

export default App;

