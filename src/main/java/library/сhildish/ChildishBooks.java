package library.сhildish;

import library.Books;
import library.Menu;
import library.exceptions.PublishingException;
import org.apache.log4j.Logger;

public abstract class ChildishBooks implements Books {

    private final static Logger LOGGER = Logger.getLogger(ChildishBooks.class);
    private String author;
    private String book;
    private String description;
    private int publishing;

    public ChildishBooks() {
    }

    public ChildishBooks (String author, String book, String description, int publishing) {

        this.author = author;
        this.book = book;
        this.description = description;
        this.publishing = publishing;
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

    public void setPublishing (int publishing) throws PublishingException {
        if (publishing <=0){ throw new PublishingException("Publishing date is incorrect!");}
        this.publishing = publishing;

    }

    public int getPublishing () {
        return this.publishing;
    }

    public void printInfo () {
        System.out.println (getAuthor());
        System.out.println (getBook());
        System.out.println (getDescription());
        System.out.println (getPublishing());
    }

    @Override
    public void changeAuthor(String author) {
    }
    @Override
    public void removeBook() {
    }
    @Override
    public  void  changePublishing (int publishing) throws PublishingException {
        setPublishing(publishing);
    }
}
