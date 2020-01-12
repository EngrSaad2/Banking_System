
package bank_management;
/**
 *
 * @author ABD
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Dbconnect {
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String password = "";
    public static Connection dbconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
