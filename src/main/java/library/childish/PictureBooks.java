package library.сhildish;

public class PictureBooks extends library.сhildish.ChildishBooks {

    private String Book;
    private String goodFeedback = "rate 6";


    public PictureBooks (String author, String book, String description, int publishing) {
        super(author, book, description, publishing);
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
