package library.db;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class Connector {
    private final static Logger LOGGER = Logger.getLogger(Connector.class);
    //private final String url = DBVerification.getDBUrl("properties", "Url"); //"jdbc:postgresql://localhost:5432/LibraryDB";
    //private final String user = DBVerification.getDBUser("properties","User"); //"postgres";
   // private final String DBPassword = DBVerification.getDBPassword("properties","Password"); //"1357908642Chudoo";

    public void authorisationDB() {
        DBVerification dbVerification = new DBVerification();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter User: ");
        String user = in.nextLine();
        System.out.println("Enter Urls: ");
        String url = in.nextLine();
        System.out.println("Enter Password: ");
        String password = in.nextLine();
        dbVerification.setDBSignificance("properties", "User", user, "Url", url, "Password", password);
        String loginProp = dbVerification.getDBUser("properties", "User");
        String loginProp1 = dbVerification.getDBPassword("properties", "password");
        String loginProp2 = dbVerification.getDBUrl("properties", "Url");
        System.out.println("User: " + loginProp + " " + "Password: " + loginProp1 + " " + "Url: " + loginProp2);

        LOGGER.info("Connected to server!");

    }

    public static Connection connect() {
        final String url = DBVerification.getDBUrl("properties", "Url"); //"jdbc:postgresql://localhost:5432/LibraryDB";
        final String user = DBVerification.getDBUser("properties","User"); //"postgres";
        final String DBPassword = DBVerification.getDBPassword("properties","Password"); //"1357908642Chudoo";
       /* Connection conn = null;
         try (FileInputStream fileinput = new FileInputStream("properties")){
             Properties prop = new Properties();
             prop.load(fileinput);
             conn =DriverManager.getConnection(
                     prop.getProperty("User"),
                     prop.getProperty("Url"),
                     prop.getProperty("Password"));
             conn.setAutoCommit(false);
             LOGGER.info("Connected to server!");
         }
         catch (IOException e) {
             LOGGER.error("Reading from file failed");

         } catch (SQLException e) {
          LOGGER.error(e.getMessage());
         }

         return conn;
    }*/
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, DBPassword);
            System.out.println("Connected to server!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}