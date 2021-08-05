package library;

import library.db.Connector;
import library.db.DbOperation;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Executor {


    public static void main(String[] args) throws FileNotFoundException, SQLException {
        Menu menu = new Menu();
        Connector connector = new Connector();
        DbOperation db = new DbOperation();
        menu.logIn();

        int index = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of lesson\n" +
                    "1 - collectionAndHashmap\n" +
                    "2 - switchCase\n" +
                    "3 - creatingInterface\n" +
                    "4 - polymorphism\n" +
                    "5 - exceptions\n"+
                    "6 - customException\n"+
                    "7 - Convert java to json file\n"+
                    "8 - Convert json file to java\n"+
                    "9 - Connect to BD\n"+
                    "10 - Operation with DB" );
            String lesson = in.nextLine();

            switch (lesson) {
                case "1":
                    menu.collectionAndHashmap();
                    index = 10;
                    break;
                case "2":
                    menu.switchCase();
                    index = 10;
                    break;
                case "3":
                    menu.creatingInterface();
                    index = 10;
                    break;
                case "4":
                    menu.polymorphism();
                    index = 10;
                    break;
                case "5":
                    menu.exceptions();
                    index = 10;
                    break;
                case "6":
                    menu.customExceptions();
                    index = 10;
                    break;
                case "7":
                    menu.javaToJson();
                    index = 10;
                    break;
                case "8":
                    menu.convertJsonStrToPOJO();
                    index = 10;
                    break;
                case "9":
                    connector.connect();
                    index = 10;
                    break;
                case "10":
                   db.dbOperation();
                    index = 10;
                    break;


                default:
                    System.out.print("Please, enter correct number of lesson.");
                    break;
            }
            index++;

        }
        while (index < 10);

    }
}




