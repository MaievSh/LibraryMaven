package library.entertaining;
import library.Books;

public class PostApocalyptic extends EntertainingBooks  {

    public PostApocalyptic(){
        setAuthor("Stephen King");
        setBook("The Stand");
        setDescription("It’s about a plague that is accidentally unleashed upon the world from a government lab and wipes out most of humanity (save those that are mysteriously immune), which would be compelling enough in its own right; but, this being Stephen King, he, of course, has to add some supernatural elements as well.");
        setPublishing(1980);
    }

    public PostApocalyptic(String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    @Override
    public String toString() {
        return "This info about Action books: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: "
                + getDescription() + " Year of publishing: " + getPublishing() ;}


}