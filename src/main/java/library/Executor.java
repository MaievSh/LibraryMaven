package library;

import library.entertaining.Action;
import library.entertaining.Crime;
import library.entertaining.PostApocalyptic;
import library.entertaining.SciFi;
import library.scientific.Dictionary;
import library.scientific.Encyclopedias;
import library.scientific.Classics;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Executor {


    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
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
                    "6 - customException" );
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

                default:
                    System.out.print("Please, enter correct number of lesson.");
                    break;
            }
            index++;

        }
        while (index < 10);

    }
}




