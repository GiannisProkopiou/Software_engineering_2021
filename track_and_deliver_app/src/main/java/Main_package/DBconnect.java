package Main_package;

import java.sql.*;
import javax.swing.JOptionPane;
public class DBconnect {
    public Connection conn=null;
    public static Connection GetConnection(){
        try{
           
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/track_and_deliver_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1999");
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
}