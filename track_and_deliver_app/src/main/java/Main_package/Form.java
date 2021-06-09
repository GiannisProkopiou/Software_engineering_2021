package Main_package;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;

public class Form {
    
    //attributes
    private String user_email;
    private String user_name;
    private String user_surname;
    private String country;
    private String city;
    private String street;
    private String street_num;
    private int postal_code;
    private String password;
    private String phone_num;
    private Subscription_state subscription;
    
    //constructor
    public Form(){};
    public Form(String user_email, String password, String user_name, String user_surname,
                String phone_num, int postal_code, String street, String street_num,
                String country, String city, Subscription_state subscription) {

                this.user_email = user_email;
                this.password = password;
                this.user_name = user_name;
                this.user_surname = user_surname;
                this.phone_num = phone_num;
                this.postal_code = postal_code;
                this.street = street;
                this.street_num = street_num;
                this.country = country;
                this.city = city;
                this.subscription = subscription;
    }
    
    //methods
    private String encryptPassword(String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        byte[] salt = new byte[16];
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = f.generateSecret(spec).getEncoded();
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(hash);

    }
    public boolean commit(){
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        
        String hashed_password = "";
        try {
            //----------------------
            //----Hash password----
            hashed_password = encryptPassword(this.password);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        //---------------------
        String query = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"; 
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(query);
            pst.setString (1, this.user_email);
            pst.setString (2, this.subscription.toString());
            pst.setString (3, this.country);
            pst.setString (4, this.city);
            pst.setString (5, this.street_num);
            pst.setString (6, this.street);
            pst.setInt (7, this.postal_code);
            pst.setString (8, this.user_name);
            pst.setString (9, this.user_surname);
            pst.setString (10, hashed_password);
            pst.setString (11, null);
            pst.execute();
            conn.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

}
