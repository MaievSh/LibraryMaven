package library.db;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DBVerification {
    private final static Logger LOGGER = Logger.getLogger(DBVerification.class);

    public static String getDBUrl(String path, String dbUrl) {
        Properties properties = new Properties();
        FileInputStream file = null;
        try {
             file = new FileInputStream(path);
            properties.load(file);
            file.close();
            return properties.getProperty(dbUrl);

        } catch (IOException e) {
            System.err.println(" Incorrect URL!");
        }
        return "default";
    }

    public static String getDBUser(String path, String user) {
        Properties properties = new Properties();
        FileInputStream file = null;
        try {
          file = new FileInputStream(path);
           properties.load(file);
            file.close();
            return properties.getProperty(user);

        } catch (IOException e) {
            System.err.println(" Incorrect user!");
        }
        return "default";
    }

    public static String getDBPassword(String path, String dbpassword) {
        Properties properties = new Properties();
        FileInputStream file = null;
        try {
           file = new FileInputStream(path);
            properties.load(file);
            file.close();
            return properties.getProperty(dbpassword);

        } catch (IOException e) {
            System.err.println(" Incorrect Password!");
        }
        return "default";
    }


    public void setDBSignificance(String path, String User, String valueUser, String url, String valueUrl, String password, String valuePassword){
        Properties properties =new Properties();
        try {
            FileOutputStream file = new FileOutputStream(path);
            properties.setProperty(User, valueUser);
            properties.setProperty(url, valueUrl);
            properties.setProperty(password,valuePassword);
            properties.store(file,"");
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
