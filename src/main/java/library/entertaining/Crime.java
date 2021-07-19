package library.entertaining;

public class Crime extends EntertainingBooks{

    public Crime (){
        setAuthor("Gillian Flynn");
        setBook("Gone Girl");
        setDescription("More than any other book in the decade, Gillian Flynn’s mega-hit Gone Girl captured the essence of female rage, as millions of well-dressed, seemingly content women used Flynn’s fearsome takedown of the patriarchy to unleash their inner discontent.");
        setPublishing(2012);
    }

    public Crime (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    @Override
    public String toString() {
        return "This info about Action books: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: "
                + getDescription() + " Year of publishing: " + getPublishing() ;}


}
