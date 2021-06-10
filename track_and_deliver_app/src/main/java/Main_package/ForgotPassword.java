
package Main_package;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
        //test();
        
    }
    
    //methods
    private void test() {
        email_textField.setText("customer2@gmail.com");
        old_password_textField.setText("123456789");
        new_password_textField.setText("123456789");
        confirm_password_textField.setText("123456789");
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
    
    
    private int checkOldPassword() {
        
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        String[] queries = {"SELECT 1 FROM customer WHERE email=? and password=?", 
            "SELECT 1 FROM delivery_man WHERE email=? and password=?", 
            "SELECT 1 FROM employee WHERE email=? and password=?"};
        int user_type = 0;

        try{
            //query 0: simple user
            //query 1: delivery man user
            //query 2: employee user
            PreparedStatement pst;
            ResultSet rs = null;
            for(user_type=0; user_type < 3; user_type++) {
                
                //chech the type of the user
                pst = conn.prepareStatement(queries[user_type]);
                pst.setString(1, email_textField.getText());
                pst.setString(2, encryptPassword(old_password_textField.getText()));
                rs = pst.executeQuery();
                
                if(rs.next()) break;
            }
           
            //if user_type == 0 then user is simple user
            //if user_type == 1 then user is delivery man user
            //if user_type == 2 then user is employee user
            if(user_type == 3) 
                JOptionPane.showMessageDialog(null, "Invalid Username or old password");


        }catch(Exception ex){JOptionPane.showMessageDialog(null, ex);}
        return user_type;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_to_signIn_screen_button = new javax.swing.JButton();
        old_password_label = new javax.swing.JLabel();
        old_password_textField = new javax.swing.JPasswordField();
        new_password_label = new javax.swing.JLabel();
        new_password_textField = new javax.swing.JPasswordField();
        confirm_password_label = new javax.swing.JLabel();
        confirm_password_textField = new javax.swing.JPasswordField();
        email_label = new javax.swing.JLabel();
        email_textField = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reset password");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        back_to_signIn_screen_button.setBackground(new java.awt.Color(51, 51, 51));
        back_to_signIn_screen_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_to_signIn_screen_button.setForeground(new java.awt.Color(255, 255, 255));
        back_to_signIn_screen_button.setText("<");
        back_to_signIn_screen_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_to_signIn_screen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_signIn_screen_buttonActionPerformed(evt);
            }
        });

        old_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        old_password_label.setForeground(new java.awt.Color(255, 255, 255));
        old_password_label.setText("Old password:");

        old_password_textField.setBackground(new java.awt.Color(204, 204, 204));
        old_password_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                old_password_textFieldActionPerformed(evt);
            }
        });

        new_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        new_password_label.setForeground(new java.awt.Color(255, 255, 255));
        new_password_label.setText("New password:");

        new_password_textField.setBackground(new java.awt.Color(204, 204, 204));

        confirm_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirm_password_label.setForeground(new java.awt.Color(255, 255, 255));
        confirm_password_label.setText("Confirm password:");

        confirm_password_textField.setBackground(new java.awt.Color(204, 204, 204));

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        email_textField.setBackground(new java.awt.Color(204, 204, 204));

        submit_button.setBackground(new java.awt.Color(51, 51, 51));
        submit_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit_button.setForeground(new java.awt.Color(255, 255, 255));
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label)
                            .addComponent(new_password_label)
                            .addComponent(confirm_password_label)
                            .addComponent(old_password_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(back_to_signIn_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(old_password_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(new_password_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(confirm_password_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(email_textField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit_button)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_to_signIn_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(email_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(old_password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(old_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(new_password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(new_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirm_password_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_signIn_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_signIn_screen_buttonActionPerformed
        dispose();
    }//GEN-LAST:event_back_to_signIn_screen_buttonActionPerformed

    private void old_password_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_old_password_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_old_password_textFieldActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        int user_type = checkOldPassword(); //check if email and password are ok and return user type
        System.out.println(user_type);
        if(user_type != 3) {
            if(new_password_textField.getText().length() >= 8 && new_password_textField.getText().equals(confirm_password_textField.getText())) {
                
                //----------------------
                Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
                //----------------------
                PreparedStatement pst;
                String user_email = email_textField.getText();
                String user_new_password = "";
                try {
                    user_new_password = encryptPassword(new_password_textField.getText());
                } catch (InvalidKeySpecException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch(user_type) {
                    
                    case 0:
                        String query = "UPDATE customer SET password = ? WHERE email=?";
                        try{
                            pst = conn.prepareStatement(query);
                            pst.setString(1, user_new_password);
                            pst.setString(2, user_email);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Password updated successfully");
                            dispose();
                        } catch (SQLException e) {JOptionPane.showMessageDialog(null, e);}
                    case 1:
                        //
                    default:
                        //will be implemented in the future
                        break;

                }
                //conn.close();

            } else {
                
                if(!(new_password_textField.getText().length() >= 8))
                    JOptionPane.showMessageDialog(null, "New password length must be >= 8!");
                else
                    JOptionPane.showMessageDialog(null, "New password and confirm must be identical!");
            }
        }
    }//GEN-LAST:event_submit_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_signIn_screen_button;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JPasswordField confirm_password_textField;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel new_password_label;
    private javax.swing.JPasswordField new_password_textField;
    private javax.swing.JLabel old_password_label;
    private javax.swing.JPasswordField old_password_textField;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}

  
