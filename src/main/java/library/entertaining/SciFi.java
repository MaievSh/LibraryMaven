package library.entertaining;

public class SciFi extends EntertainingBooks{

    public SciFi(){
        setAuthor("George Orwell");
        setBook("1984");
        setDescription("1984 is a prime example of this, a dystopian novel where our culture has become the victim of government surveillance and public manipulation. An important read for any age.");
        setPublishing(1949);
    }

    public SciFi (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    @Override
    public String toString() {
        return "This info about Action books: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: "
                + getDescription() + " Year of publishing: " + getPublishing() ;}

}

