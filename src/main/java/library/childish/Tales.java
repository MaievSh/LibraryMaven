package library.сhildish;

public class Tales extends library.сhildish.ChildishBooks {


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
