package library.scientific;

public class Encyclopedias extends ScientificBooks {

    private String book;
    private String comment = "the are no comments";
    private int copies;

    public Encyclopedias (String author, String book, String description, int publishing) {
        super(author, book, description, publishing);
    }

    public Encyclopedias(String author, String book, String description, int publishing, String comment, int copies) {
        super (author, book, description, publishing);
        this.comment = comment;
        this.copies = copies;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public String getComment() {
        return this.comment;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getCopies() {
        return this.copies;
    }


    @Override
    public String toString() {
        return "This info about Encyclopedia: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: "
                + getDescription() + " Year of publishing: " + getPublishing() + " Comment: " + getComment() + " Number of copies: " +
                getCopies();}


}





