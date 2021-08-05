package library.сhildish;

import library.Menu;
import org.apache.log4j.Logger;

public class PictureBooks extends library.сhildish.ChildishBooks {

    private final static Logger LOGGER = Logger.getLogger(PictureBooks.class);
    private String book;
    private String goodFeedback;
    private String author;
    private String description;
    private int publishing;


    public PictureBooks (String author, String book, String description, int publishing) {
        super(author, book, description, publishing);
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getAuthor () {
        return this.author;
    }

    public void setBook (String book) {
        this.book = book;
    }

    public String getBook () {
        return this.book;
    }
    public void setDescription (String description) {
        this.description = description;
    }

    public String getDescription () {
        return this.description;
    }

    public void setPublishing(int publishing) {
        this.publishing = publishing;
    }

    public int getPublishing() {
        return this.publishing;
    }
    public PictureBooks(){

    }

    public PictureBooks (String author, String book, String description, int publishing, String goodFeedback) {
        super(author, book, description, publishing);
        this.goodFeedback = goodFeedback;
    }

    public void setGoodFeedback(String goodFeedback){
        this.goodFeedback = goodFeedback;
    }

    public String getGoodFeedback() {
        return this.goodFeedback;
    }

    @Override
    public String toString() {
        return "This info about PictureBooks: " + " Author: " + getAuthor()+  " Name of book: " + getBook()+ " Description: " + getDescription()+ " Year of publishing: " + getPublishing();}

    @Override
    public void changeAuthor(String author) {

    }

    @Override
    public void removeBook() {
        super.removeBook();
    }
}
