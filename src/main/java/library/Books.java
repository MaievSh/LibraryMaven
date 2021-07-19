package library;

import library.exceptions.PublishingException;

public interface Books {
    public void printInfo ();

    public void changeAuthor(String author);

    public String getBook();

    public void removeBook();

    public  void  changePublishing (int publishing) throws PublishingException;

}
