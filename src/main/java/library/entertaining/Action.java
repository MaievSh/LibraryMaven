package library.entertaining;

public class Action extends EntertainingBooks{

    public Action (){
        setAuthor("Jules Verne");
        setBook("Journey to the Center of the Earth");
        setDescription("Journey to the Center of the Earth is exactly that: a trip to the inside of the world, which is where German professor Otto Lidenbrock theorizes that volcanic tubes will lead.");
        setPublishing(1864);
    }

    public Action (String author, String book, String description, int publishing){
        super(author, book, description, publishing);
    }

    @Override
    public String toString() {
        return "This info about Action books: " + " Author: " + getAuthor()+ " Name of book: " + getBook() + " Description: "
                + getDescription() + " Year of publishing: " + getPublishing() ;}

}

