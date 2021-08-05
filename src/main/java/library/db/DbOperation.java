package library.db;

import com.sun.jdi.connect.spi.Connection;
import library.db.Connector;
import library.entertaining.Action;
import library.entertaining.Crime;
import library.entertaining.PostApocalyptic;
import library.entertaining.SciFi;
import library.exceptions.PublishingException;
import library.scientific.Classics;
import library.scientific.Dictionary;
import library.scientific.Encyclopedias;
import library.utils.Verification;
import library.сhildish.PictureBooks;
import library.сhildish.Tales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import org.apache.log4j.Logger;
import library.utils.JsonWR;
import java.sql.PreparedStatement;

public class DbOperation {

    public void dbOperation() {
        String query = "INSERT INTO sciFiBooks (author,book,description,publishing)" + " values ('Kek','kek2','lol','2021')";
        Connector conn = new Connector();
        try{
            PreparedStatement pst = conn.connect().prepareStatement(query);
            ResultSet printResult = pst.executeQuery();
            String str = printResult.getString(1);
            System.out.println(str);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }
}
