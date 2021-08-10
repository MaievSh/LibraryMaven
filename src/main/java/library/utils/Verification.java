package library.utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Verification {

    public String getLogin(String path, String login) {
        Properties properties = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
            properties.load(file);
            file.close();
            return properties.getProperty(login);

        } catch (IOException e) {
            System.err.println(" Incorrect login!");
        }
        return "default";
    }

    public String getPassword(String path, String password) {
        Properties properties = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
            properties.load(file);
            file.close();
            return properties.getProperty(password);

        } catch (IOException e) {
            System.err.println(" Incorrect Password!");
        }
        return "default";
    }


    public void setSignificance(String path, String login, String value,String password, String valuePass){
        Properties properties =new Properties();
        try {
            FileOutputStream file = new FileOutputStream(path);
            properties.setProperty(login, value);
            properties.setProperty(password,valuePass);
            properties.store(file,"");
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
