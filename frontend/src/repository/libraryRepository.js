import axios from "../custom-axios/axios"

const LibraryService = {

    fetchAuthors : () => {
        return axios.get("/authors"); //ova url se lepi na toa sto e postaveno vo axios
    },
    fetchCountries: () => {
        return axios.get("/countries");
    },
    fetchBooks: () => {
        return axios.get("/books");
    },
    fetchCategories: () => {
        return axios.get("/categories");
    },
    deleteBook: (id) => {
        return axios.delete(`/books/delete/${id}`)
        //`` za evaluacija i $ za pristap do vrednost
    },
    addBook: (name, category, author, availableCopies) => {
        return axios.post("/books/add",{
            "name" : name,
            "category" : category,
            "author" : author,
            "availableCopies" : availableCopies
        });
    },
    editBook: (id, name, category, author, availableCopies) => {
        return axios.put(`/books/edit/${id}`, {
            "name" : name,
            "category" : category,
            "author" : author,
            "availableCopies" : availableCopies
        });
    },
    getBook: (id) => {
        return axios.get(`/books/${id}`);
    },
    markBookAsTaken: (id) => {
        return axios.put(`/books/edit/${id}/mark`);
    }
}

export default LibraryService;