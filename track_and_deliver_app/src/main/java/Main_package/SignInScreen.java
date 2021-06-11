package Main_package;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;

public class SignInScreen extends javax.swing.JFrame {

    
    public SignInScreen() {
        initComponents();
        singIn_email_txt.setText("sina@gmail.com");
        password_textField.setText("12345678");
    }
    
    //methods
    private void homeScreen() {
        //go back to home screen
        new HomeScreen().setVisible(true);
        dispose();
    }
    
    private void customerHomeScreen(Customer current_customer) {
        new CustomerHomeScreen(current_customer).setVisible(true);
        dispose();
    }
    
    private void deliveryManScreen(DeliveryMan current_delivery_man) {
        new DeliveryManScreen(current_delivery_man).setVisible(true);
        dispose();
    }
    
    private void forgotPassword() {
        
        new ForgotPassword().setVisible(true);
    }

    //check hashed password
    private String encryptPassword(String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        byte[] salt = new byte[16];
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = f.generateSecret(spec).getEncoded();
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(hash);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singIn_panel = new javax.swing.JPanel();
        javax.swing.JLabel singInScreen_welcomeLabel = new javax.swing.JLabel();
        singIn_email_label = new javax.swing.JLabel();
        singIn_passwordl_label = new javax.swing.JLabel();
        singIn_email_txt = new javax.swing.JTextField();
        password_textField = new javax.swing.JPasswordField();
        signIn_button = new javax.swing.JButton();
        forgotPassword_button = new javax.swing.JButton();
        back_to_home_screen_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign in");
        setResizable(false);

        singIn_panel.setBackground(new java.awt.Color(51, 51, 51));
        singIn_panel.setRequestFocusEnabled(false);

        singInScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singInScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singInScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singInScreen_welcomeLabel.setText("T&D");

        singIn_email_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        singIn_email_label.setForeground(new java.awt.Color(255, 255, 255));
        singIn_email_label.setText("Email:");

        singIn_passwordl_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        singIn_passwordl_label.setForeground(new java.awt.Color(255, 255, 255));
        singIn_passwordl_label.setText("Password:");

        singIn_email_txt.setBackground(new java.awt.Color(240, 240, 240));
        singIn_email_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        singIn_email_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        singIn_email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singIn_email_txtActionPerformed(evt);
            }
        });

        password_textField.setBackground(new java.awt.Color(240, 240, 240));
        password_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_textField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        signIn_button.setBackground(new java.awt.Color(51, 51, 51));
        signIn_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signIn_button.setForeground(new java.awt.Color(255, 255, 255));
        signIn_button.setText("Sign in");
        signIn_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signIn_button.setFocusable(false);
        signIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_buttonActionPerformed(evt);
            }
        });

        forgotPassword_button.setBackground(new java.awt.Color(51, 51, 51));
        forgotPassword_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forgotPassword_button.setForeground(new java.awt.Color(191, 0, 0));
        forgotPassword_button.setText("Forgot Password;");
        forgotPassword_button.setBorder(null);
        forgotPassword_button.setFocusable(false);
        forgotPassword_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassword_buttonActionPerformed(evt);
            }
        });

        back_to_home_screen_button.setBackground(new java.awt.Color(51, 51, 51));
        back_to_home_screen_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_to_home_screen_button.setForeground(new java.awt.Color(255, 255, 255));
        back_to_home_screen_button.setText("<");
        back_to_home_screen_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_to_home_screen_button.setFocusable(false);
        back_to_home_screen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_home_screen_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout singIn_panelLayout = new javax.swing.GroupLayout(singIn_panel);
        singIn_panel.setLayout(singIn_panelLayout);
        singIn_panelLayout.setHorizontalGroup(
            singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singIn_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(singIn_passwordl_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singIn_email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(forgotPassword_button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singIn_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signIn_button, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(singIn_email_txt)
                            .addComponent(password_textField))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(singIn_panelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        singIn_panelLayout.setVerticalGroup(
            singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singIn_panelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(singInScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singIn_email_label)
                    .addComponent(singIn_email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(singIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singIn_passwordl_label)
                    .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassword_button)
                .addGap(69, 69, 69)
                .addComponent(signIn_button)
                .addGap(161, 161, 161))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singIn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(singIn_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void singIn_email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singIn_email_txtActionPerformed
        
    }//GEN-LAST:event_singIn_email_txtActionPerformed

    private void signIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_buttonActionPerformed
        
        //open connection to DB and make 3 queries to check if users is simple user 
        //delivery or user working for company
        
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        String[] queries = {"SELECT * FROM customer WHERE email=? and password=?", 
            "SELECT * FROM delivery_man WHERE email=? and password=?", 
            "SELECT * FROM employee WHERE email=? and password=?"};
        int user_type;
        PreparedStatement pst;
        ResultSet rs = null;
        try{
            //query 0: simple user
            //query 1: delivery man user
            //query 2: employee user
            
            for(user_type=0; user_type < 3; user_type++) {
                
                //chech the type of the user
                pst = conn.prepareStatement(queries[user_type]);
                pst.setString(1, singIn_email_txt.getText());
                pst.setString(2, encryptPassword(password_textField.getText()));
                rs = pst.executeQuery();
                
                if(rs.next()) break;
            }
           
            if(user_type == 3) {
                pst = conn.prepareStatement(queries[1]);
                pst.setString(1, singIn_email_txt.getText());
                pst.setString(2, password_textField.getText());
                rs = pst.executeQuery();
                if(rs.next())
                    user_type = 1;
            }
                
           
            //if user_type == 0 then user is simple user
            //if user_type == 1 then user is delivery man user
            //if user_type == 2 then user is employee user
            if(user_type == 3) 
                JOptionPane.showMessageDialog(null, "Invalid Username or password");
            else {//if 
                var user_name = rs.getString("name");
                var user_surname = rs.getString("surname");
                
                switch (user_type) {
                //set visible simple user main screen customer screen
                    case 0:
                        //create customer object
                        Subscription_state customer_state = Subscription_state.BASIC;
                        if(rs.getString("subscription").equals("premium"))
                            customer_state = Subscription_state.PREMIUM;
                        Customer current_customer = new Customer(
                                rs.getString("email"), rs.getString("password"),
                                Integer.parseInt(rs.getString("postal_code")), rs.getString("street_number"), 
                                rs.getString("street"), rs.getString("city"), rs.getString("country"), 
                                rs.getString("name"), rs.getString("surname"), 
                                rs.getString("phone_number"), customer_state
                        );
                        JOptionPane.showMessageDialog(null, "Welcome "+ user_name + " "+ user_surname);
                        customerHomeScreen(current_customer);
                        conn.close();
                        break;
                    case 1:
                        System.out.println("User_type: "+user_type);
                        //create delivery_man object
                        ArrayList<Package> packages_to_be_delivered = new ArrayList<Package>();
                        ArrayList<Rating> ratings = new ArrayList<Rating>(); 
                        
                        Delivery_man_state delivery_man_state = Delivery_man_state.AVAILABLE;
                        if(rs.getString("state").equals("not_available"))
                            delivery_man_state = Delivery_man_state.NOT_AVAILABLE;
                        else if(rs.getString("state").equals("in_duty"))
                            delivery_man_state = Delivery_man_state.IN_DUTY;
                        
                        DeliveryMan current_delivery_man = new DeliveryMan(
                        rs.getString("email"), rs.getString("name"), 
                        rs.getString("surname"), rs.getString("password"), rs.getString("phone"), 
                        delivery_man_state, -1,
                        packages_to_be_delivered, ratings);
                        
                        deliveryManScreen(current_delivery_man);
                        break;
                        
                    default:
                        //will be implemented in the future
                        break;
                }
                //Make login screen invisivble
                //setVisible(false);     
                
            }
            conn.close();
           
        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
    }//GEN-LAST:event_signIn_buttonActionPerformed

    private void back_to_home_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_home_screen_buttonActionPerformed
        homeScreen();
    }//GEN-LAST:event_back_to_home_screen_buttonActionPerformed

    private void forgotPassword_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassword_buttonActionPerformed
        forgotPassword();
    }//GEN-LAST:event_forgotPassword_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_home_screen_button;
    private javax.swing.JButton forgotPassword_button;
    private javax.swing.JPasswordField password_textField;
    private javax.swing.JButton signIn_button;
    private javax.swing.JLabel singIn_email_label;
    private javax.swing.JTextField singIn_email_txt;
    private javax.swing.JPanel singIn_panel;
    private javax.swing.JLabel singIn_passwordl_label;
    // End of variables declaration//GEN-END:variables
}
