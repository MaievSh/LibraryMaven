package library.scientific;

public class Classics extends ScientificBooks{

    private String country;

    public Classics (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    public Classics (String author, String book, String description, int publishing, String country){
        super (author, book, description, publishing);
        this.country = country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }


    @Override
    public String toString() {
        return "This info about classic book: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: " + getDescription() + " Year of publishing: " + getPublishing() + " Country: " + getCountry();}

}