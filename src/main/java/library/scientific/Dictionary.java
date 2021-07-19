package library.scientific;

public class Dictionary extends ScientificBooks{

    private String type;

    public Dictionary (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public Dictionary (String author, String book, String description, int publishing, String type){
        super (author, book, description, publishing);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "This info about Dictionary: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: " + getDescription()
                + " Year of publishing: " + getPublishing() + " Type of Dictionary: " + getType();}


}
