package Classes;
import java.sql.*;
public class ConnectionMySQL {
    
    public Connection con;
    public PreparedStatement pst;
    public Statement st;
    public ResultSet rs;

    public ConnectionMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            st = con.createStatement();
        } catch (Exception e) {e.printStackTrace();
        }
    }
}