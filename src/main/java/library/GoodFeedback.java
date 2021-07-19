package library;
import library.scientific.Classics;
import library.сhildish.ChildishBooks;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;

import java.util.*;

public class GoodFeedback {
    private List<Books> listOfBooks;
    private List<PictureBooks> listOfPictureBooks;
    private List<Tales> listOfTales;
    private Set<Classics> setOfClassics;


    public GoodFeedback() {
        listOfBooks = new ArrayList<>();
        listOfPictureBooks = new ArrayList<>();
        listOfTales = new LinkedList<>();
        setOfClassics = new HashSet<Classics>();
    }

    public void setBooks(Books book) {
        listOfBooks.add(book);
    }

    public List<Books> getBooks() {
        return listOfBooks;
    }

    public void setPictureBooks(PictureBooks pictureBooks) {
        listOfPictureBooks.add(pictureBooks);
    }

    public List<PictureBooks> getlistOfPictureBooks() {
        return listOfPictureBooks;
    }

    public void setTales(Tales tales) {
        listOfTales.add(tales);
    }

    public List<Tales> getlistOfTales() {
        return listOfTales;
    }

    public void setClassics(Classics classics) {
        setOfClassics.add(classics);
    }

    public Set<Classics> getSetOfClassics() {
        return setOfClassics;
    }

    public void removeBook(Tales tales) {
        listOfTales.remove(tales);
    }

    public void removeBook(PictureBooks pictureBooks) {
        listOfPictureBooks.remove(pictureBooks);
    }

    public static void verification(GoodFeedback goodFeedback) {
        int i = 0;
        if (!goodFeedback.getlistOfPictureBooks().isEmpty()) {

            while (i < goodFeedback.getlistOfPictureBooks().size()) {

                //     goodFeedback.removeBook();
                i++;

            }

        }
    }
}