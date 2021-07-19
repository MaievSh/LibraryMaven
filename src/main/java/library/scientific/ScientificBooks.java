package library.scientific;

import library.Books;


public abstract class ScientificBooks implements Books {

    private String author;
    private String book;
    private String description;
    private int publishing;

    public ScientificBooks() {
    }

    public ScientificBooks(String author, String book, String description, int publishing) {

        this.author = author;
        this.book = book;
        this.description = description;
        this.publishing = publishing;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getBook() {
        return this.book;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPublishing(int publishing) {
        this.publishing = publishing;
    }

    public int getPublishing() {
        return this.publishing;
    }

    @Override
    public void changeAuthor(String author) {
        setAuthor(author);
    }

    @Override
    public void printInfo() {
    }

    @Override
    public void removeBook() {

    }

    @Override
    public  void  changePublishing (int publishing){
        setPublishing(publishing);
    }
}
