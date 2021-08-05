package library.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {

    private final String url = "jdbc:postgresql://localhost:5432/LibraryDB";
    private final String user = "postgres";
    private final String password = "1357908642Chudoo";

    public Connection connect() {
        Connection conn = null;
        try {
             conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to server!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}