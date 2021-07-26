package library.сhildish;

import library.Menu;
import org.apache.log4j.Logger;

public class Tales extends library.сhildish.ChildishBooks {
    private final static Logger LOGGER = Logger.getLogger(Tales.class);

    public Tales (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public Tales (String author, String book, String description, int publishing, String goodFeedback) {
        super(author, book, description, publishing);
    }


    @Override
    public String toString() {
        return "This info about PictureBooks: " + " Author: " + getAuthor()+  " Name of book: " + getBook()+ " Description: " + getDescription()+ " Year of publishing: " + getPublishing();}

}
