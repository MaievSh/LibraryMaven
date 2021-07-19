package library;

import library.entertaining.Action;
import library.entertaining.Crime;
import library.entertaining.PostApocalyptic;
import library.entertaining.SciFi;
import library.exceptions.PublishingException;
import library.scientific.Classics;
import library.scientific.Dictionary;
import library.scientific.Encyclopedias;
import library.scientific.ScientificBooks;
import library.utils.Verification;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;
import library.Books;
import library.exceptions.PublishingException;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import library.utils.Verification;

public class Menu {

    public Menu() {

    }
    public void logIn(){
        Verification verification = new Verification();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();
        verification.setSignificance("properties","login",login,"password",password);
        String loginProp = verification.getLogin("properties","login");
        String loginProp1 = verification.getPassword("properties","password");
        System.out.println("Login: "+loginProp+" "+"Password: "+loginProp1);
    }

    public void creatingInterface() {

        PictureBooks pictureBooks = new PictureBooks("Gorman", "Kolobok", "This is book about russia pie", 1982);

        Tales tales = new Tales("Daisy Fisher", "cinderella", "is a folk tale about oppression and triumphant reward." +
                " Thousands of variants are known throughout the world. " +
                "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.", 1697, "good book");

        Encyclopedias encyclopedias = new Encyclopedias("Mira Filippova", "Encyclopedia of everything in the world", "book of everything in the world", 2015, "good book", 1200);
        encyclopedias.printInfo();

        Encyclopedias bigEncyclopedias = new Encyclopedias("Tatiana Korneva", "Great children's encyclopedia", "Where did I come from?", 2000);
        String bigEncyclopediasInfo = bigEncyclopedias.toString();
        System.out.println(bigEncyclopediasInfo);

        bigEncyclopedias.changeAuthor("Tatiana Novik");
        String author = bigEncyclopedias.toString();
        System.out.println(author);

        Dictionary dictionary = new Dictionary("Nadezhda Nadezhkina", "Japan-Russian dictionary", "translate words", 1986, " Japan-Russian");
        String infoDictionary = dictionary.toString();
        System.out.println(infoDictionary);

        Classics classics = new Classics("L. N. Tolstoy", "World and war", " epic novel", 1865, " Russia");
        String infoClassics = classics.toString();
        System.out.println(infoClassics);
    }

    public void polymorphism() {
        PictureBooks kolobok = new PictureBooks("Gorman", "Kolobok", "This is book about russia pie", 1982);
        Tales cinderella = new Tales("Daisy Fisher", "cinderella", "is a folk tale about oppression and triumphant reward." +
                " Thousands of variants are known throughout the world. " +
                "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.", 1697, "good book");

        GoodFeedback goodFeedback = new GoodFeedback();
        goodFeedback.setBooks(cinderella);
        goodFeedback.setBooks(kolobok);

        for (Books book : goodFeedback.getBooks())
            System.out.println(book.getBook());

    }

    public void switchCase() {
        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the genre of books you are interested in: Action, Crime, Post-Apocalypse, SciFi");
            String genre = in.nextLine();

            switch (genre) {
                case "Action":
                    System.out.println("You choose Action books");
                    Action centerEarth = new Action("Jules Verne", "Journey to the Center of the Earth", "Journey to the Center of the Earth is exactly that: " +
                            "a trip to the inside of the world, which is where German professor Otto Lidenbrock theorizes that volcanic tubes will lead." +
                            "", 1984);
                    centerEarth.printInfo();
                    index = 10;
                    break;
                case "Crime":
                    System.out.println("You choose Crime books");
                    Crime goneGirl = new Crime("Gillian Flynn", "Gone Girl", "More than any other book in the decade, Gillian Flynn’s mega-hit Gone Girl captured the essence of female rage, " +
                            "as millions of well-dressed, seemingly content women used Flynn’s fearsome takedown of the patriarchy to unleash their inner discontent", 2012);
                    goneGirl.printInfo();
                    index = 10;
                    break;
                case "Post-Apocalypse":
                    System.out.println("You choose Post-Apocalypse books");
                    PostApocalyptic theStand = new PostApocalyptic("Stephen King", "The Stand", "It’s about a plague that is accidentally unleashed upon the world from a government lab and wipes out most of humanity (save those that are mysteriously immune)," +
                            " which would be compelling enough in its own right; " +
                            "but, this being Stephen King, he, of course, has to add some supernatural elements as well.", 1980);
                    theStand.printInfo();
                    index = 10;
                    break;
                case "SciFi":
                    System.out.println("You choose SciFi books");
                    SciFi orwell1984 = new SciFi("George Orwell", "1984", "1984 is a prime example of this," +
                            " a dystopian novel where our culture has become the victim of government surveillance and public manipulation.", 1949);
                    orwell1984.printInfo();
                    index = 10;
                    break;
                default:
                    System.out.println("Please, enter correct genre of books.");
                    break;
            }
            index++;

        }
        while (index < 10);
    }

    public void collectionAndHashmap() {
        System.out.println("==========================================================================================");


        PictureBooks kolobok = new PictureBooks("Gorman", "Kolobok", "This is book about russia pie", 1982);
        PictureBooks snowyDay = new PictureBooks("Ezra Jack", "The Snowy Day", "The magic and wonder of winter’s first snowfall is perfectly captured in Ezra Jack Keat’s Caldecott Medal-winning picture book. " +
                "This celebrated classic has been shared by generations of readers and listeners, a must-have for every child’s bookshelf.", 2005);
        PictureBooks panda = new PictureBooks("Jo Lodge", "Time for Bed, Panda", "A perfect bedtime story for babies, this colourful board book teaches little ones simple words about their bedtime routine.", 2010);
        PictureBooks freddyTheFrog = new PictureBooks("Axel Scheffler", "Freddy the Frog", "Follow Freddy the frog as he squelches in slime, races his friends and croaks all day!", 2015);

        GoodFeedback feedback = new GoodFeedback();
        feedback.setPictureBooks(kolobok);
        feedback.setPictureBooks(snowyDay);
        feedback.setPictureBooks(panda);
        feedback.setPictureBooks(freddyTheFrog);
        feedback.removeBook(panda);

        for (PictureBooks pictureBooks1 : feedback.getlistOfPictureBooks())
            System.out.println(pictureBooks1.getBook());


        Tales cinderella = new Tales("Daisy Fisher", "cinderella", "is a folk tale about oppression and triumphant reward." +
                " Thousands of variants are known throughout the world. " +
                "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.", 1697, "good book");
        Tales percyJackson = new Tales("Rick Riordan", "Percy Jackson", "All year the half-bloods have been preparing for battle against the Titans, knowing the odds of victory are grim", 1998);

        System.out.println("==========================================================================================");

        GoodFeedback feedbackOfTales = new GoodFeedback();
        feedbackOfTales.setTales(cinderella);
        feedbackOfTales.setTales(percyJackson);
        feedbackOfTales.removeBook(cinderella);


        for (Tales tales1 : feedbackOfTales.getlistOfTales())
            System.out.println(tales1.getBook());

        System.out.println("==========================================================================================");

        Classics worldAndWar = new Classics("L. N. Tolstoy", "World and war", " epic novel", 1865, " Russia");

        GoodFeedback feedbackOfClassics = new GoodFeedback();
        feedback.setClassics(worldAndWar);

        HashMap<String, String> map = new HashMap<>();
        map.put(cinderella.getBook(), "German Authfich");
        map.put(percyJackson.getBook(), "Brendon Lee");
        System.out.println(map.get(cinderella.getBook()));
        System.out.println(map.get(percyJackson.getBook()));


        HashMap<String, String> map1 = new HashMap<>();
        map1.put(kolobok.getBook(), "Vitalii Anisimov");
        map1.put(snowyDay.getBook(), "Alex Stakh");
        map1.put(panda.getBook(), "Korin Shelm");
        map1.put(freddyTheFrog.getBook(), "Danial Sinkler");
        if (map1 != null) {
            map1.remove(kolobok.getBook());
        }

        Set<String> strings = map1.keySet();
        for (String books : strings) {
            System.out.println(books);
        }

    }

    public void exceptions() throws FileNotFoundException {

        Classics worldAndWar = new Classics("L. N. Tolstoy", "World and war", " epic novel", 1865, " Russia");

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter publishing date: ");
            int wAw;

            wAw = in.nextInt();
            worldAndWar.changePublishing(wAw);
            String publishing = worldAndWar.toString();
            System.out.println(publishing);
        } catch (Throwable e) {
            System.err.println("Date of publication can be only integer! ");

        } finally {
            int index = 0;
            do {
                System.out.println("If you want to change the date again press 1 or 2 if you want exit program");
                Scanner in1 = new Scanner(System.in);
                String number = in1.nextLine();

                switch (number) {
                    case "1":
                        System.out.println("");
                        Scanner in2 = new Scanner(System.in);
                        System.out.println("Please enter publishing date: ");
                        int wAw1;
                        wAw1 = in2.nextInt();
                        worldAndWar.changePublishing(wAw1);
                        String publishing = worldAndWar.toString();
                        System.out.println(publishing);
                        index = 10;
                        break;
                    case "2":
                        System.exit(0);
                        index = 10;
                        break;

                    default:
                        System.out.println("Enter only 1 or 2 please.");
                        break;
                }
                index++;

            }
            while (index < 10);
        }
    }

    public void customExceptions() {


        {
            int index = 0;
            do {
                System.out.println("If you want to see the correct version of the book description enter 1 or 2 if you want to see variant with custom exception");
                Scanner in1 = new Scanner(System.in);
                String number = in1.nextLine();

                switch (number) {
                    case "1":
                        Tales cinderella = new Tales("Daisy Fisher", "cinderella", "is a folk tale about oppression and triumphant reward." +
                                " Thousands of variants are known throughout the world. " +
                                "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.", 1697, "good book");
                        String infoTales = cinderella.toString();
                        System.out.println(infoTales);
                        index = 10;
                        break;
                    case "2":
                        try {
                            Tales cinderella1 = new Tales("Daisy Fisher", "cinderella", "is a folk tale about oppression and triumphant reward." +
                                    " Thousands of variants are known throughout the world. " +
                                    "The protagonist is a young woman living in forsaken circumstances that are suddenly changed to remarkable fortune, with her ascension to the throne via marriage.", 0, "good book");
                            String infoTales1 = cinderella1.toString();
                            System.out.println(infoTales1);
                            cinderella1.setPublishing(0);
                            index = 10;
                        }
                        catch (PublishingException e)
                        {e.printStackTrace();
                            System.exit(0);}

                        break;

                    default:
                        System.out.println("Enter only 1 or 2 please.");
                        break;
                }
                index++;

            }
            while (index < 10);
        }
    }
}