
package Main_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class PayingScreen extends javax.swing.JFrame {

    private Customer current_signed_in_customer;
    public PayingScreen(Customer current_signed_in_customer) {
        
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
        //set maximum characters
        card_number_textField.setDocument(new JTextFieldLimit(16));
        cvv_textField.setDocument(new JTextFieldLimit(3));
        //email standrad
        email_textField.setText(current_signed_in_customer.getCustomerEmail());
        email_textField.setEditable(false);
        //No past dates
        expiry_date_datePicker.setMinSelectableDate(new Date());
        
    }

    
    //methods
    private void customerHomeScreen(Customer current_signed_in_customer) {
        new CustomerHomeScreen(current_signed_in_customer).setVisible(true);
        dispose();
    }
    
    private void signInScreen() {
        new SignInScreen().setVisible(true);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel singInScreen_welcomeLabel = new javax.swing.JLabel();
        card_number_label = new javax.swing.JLabel();
        card_number_textField = new javax.swing.JTextField();
        expiry_date_label = new javax.swing.JLabel();
        expiry_date_datePicker = new com.toedter.calendar.JDateChooser();
        back_to_customer_screen_button = new javax.swing.JButton();
        cvv_label = new javax.swing.JLabel();
        cvv_textField = new javax.swing.JTextField();
        full_name_label = new javax.swing.JLabel();
        full_name_textField = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        email_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        error_message_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank enviroment");
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        singInScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singInScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singInScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singInScreen_welcomeLabel.setText("BANK");

        card_number_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        card_number_label.setForeground(new java.awt.Color(255, 255, 255));
        card_number_label.setText("Card number:");

        card_number_textField.setBackground(new java.awt.Color(204, 204, 204));

        expiry_date_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expiry_date_label.setForeground(new java.awt.Color(255, 255, 255));
        expiry_date_label.setText("Expiry date:");

        expiry_date_datePicker.setBackground(new java.awt.Color(204, 204, 204));

        back_to_customer_screen_button.setBackground(new java.awt.Color(51, 51, 51));
        back_to_customer_screen_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_to_customer_screen_button.setForeground(new java.awt.Color(255, 255, 255));
        back_to_customer_screen_button.setText("<");
        back_to_customer_screen_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_to_customer_screen_button.setFocusable(false);
        back_to_customer_screen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_customer_screen_buttonActionPerformed(evt);
            }
        });

        cvv_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cvv_label.setForeground(new java.awt.Color(255, 255, 255));
        cvv_label.setText("CVV:");

        cvv_textField.setBackground(new java.awt.Color(204, 204, 204));

        full_name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        full_name_label.setForeground(new java.awt.Color(255, 255, 255));
        full_name_label.setText("Full name:");

        full_name_textField.setBackground(new java.awt.Color(204, 204, 204));

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        email_textField.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(191, 0, 0));
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        error_message_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        error_message_label.setForeground(new java.awt.Color(191, 0, 0));
        error_message_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_to_customer_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(email_label)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(card_number_label)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(expiry_date_label)
                                    .addGap(134, 134, 134)
                                    .addComponent(cvv_label))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(card_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(expiry_date_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cvv_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(full_name_label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(full_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(error_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_to_customer_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(singInScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_message_label)
                .addGap(7, 7, 7)
                .addComponent(card_number_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiry_date_label)
                    .addComponent(cvv_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cvv_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiry_date_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(full_name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(full_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(email_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void back_to_customer_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_customer_screen_buttonActionPerformed
        customerHomeScreen(current_signed_in_customer);
    }//GEN-LAST:event_back_to_customer_screen_buttonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //check if number is int
        
        if((card_number_textField.getText().equals("")) || (expiry_date_datePicker == null) || (cvv_textField.getText().equals(""))) {
            error_message_label.setText("Some fields are empty!");
        } else {
            String OTP = JOptionPane.showInputDialog(null,"Enter code sent to your mobile"); //one-time password
            String query = "UPDATE customer SET subscription='premium' WHERE email=?";
            Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
            PreparedStatement pst;
            try {
                pst = conn.prepareStatement(query);
                pst.setString (1, current_signed_in_customer.getCustomerEmail());
                pst.execute();
                conn.close();
                JOptionPane.showMessageDialog(null, "Succesful update!");
                signInScreen();
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_customer_screen_button;
    private javax.swing.JLabel card_number_label;
    private javax.swing.JTextField card_number_textField;
    private javax.swing.JLabel cvv_label;
    private javax.swing.JTextField cvv_textField;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textField;
    private javax.swing.JLabel error_message_label;
    private com.toedter.calendar.JDateChooser expiry_date_datePicker;
    private javax.swing.JLabel expiry_date_label;
    private javax.swing.JLabel full_name_label;
    private javax.swing.JTextField full_name_textField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
