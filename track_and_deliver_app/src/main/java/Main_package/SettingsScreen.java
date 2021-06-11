
package Main_package;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.awt.Color;
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

public class SettingsScreen extends javax.swing.JFrame {
    
    private Customer current_signed_in_customer;
    private DeliveryMan current_signed_in_delivery_man;

    public SettingsScreen(Customer current_signed_in_customer) {
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
        fillFields_customer();
    }

    public SettingsScreen(DeliveryMan current_signed_in_delivery_man) {
        initComponents();
        this.current_signed_in_delivery_man = current_signed_in_delivery_man;
        fillFields_delivery_man();
    }
    
    //methods
    private void customerScreen(Customer current_signed_in_customer) {
        new CustomerHomeScreen(current_signed_in_customer).setVisible(true);
        dispose();
    }

    private void fillFields_delivery_man() {
        
    }
    
    private void fillFields_customer() {
        
        //FILL alll fields except password
        emai_textField.setText(current_signed_in_customer.getCustomerEmail());
        city_textField.setText(current_signed_in_customer.getCity());
        street_textField.setText(current_signed_in_customer.getStreet());
        street_number_textField.setText(current_signed_in_customer.getStreetNum());
        postal_code_textField.setText(Integer.toString(current_signed_in_customer.getPostalCode()));
        phone_number_textField.setText(current_signed_in_customer.getCustomerPhoneNumber());
        name_textField.setText(current_signed_in_customer.getCustomerName());
        surname_textField.setText(current_signed_in_customer.getCustomerSurname());
        country_textField.setText(current_signed_in_customer.getCountry());
        
        if(current_signed_in_customer.getCustomerSubscription() == Subscription_state.BASIC)
            subscription_textField.setText("BASIC");
        else
            subscription_textField.setText("PREMIUM");

        name_textField.setEditable(false);
        surname_textField.setEditable(false);
        country_textField.setEditable(false);
        subscription_textField.setEditable(false);
    }
    
    private boolean SettingsScreenNoMissingField() {

        boolean no_errors = true;
        if(emai_textField.getText().equals("")) {
            emai_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }
        
        if(city_textField.getText().equals("")) {
            city_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }

        if(street_textField.getText().equals("")) {
            street_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }
        
        if(street_number_textField.getText().equals("")) {
            street_number_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }

        if(postal_code_textField.getText().equals("")) {
            postal_code_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }

        if(phone_number_textField.getText().equals("")) {
            phone_number_textField.setBackground(new Color(191, 0, 0));
            no_errors = no_errors && false;
        }
        if(!no_errors)
            error_message_label.setText("Some fields are empty!");

        return no_errors;
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

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel settingsScreen_welcomeLabel = new javax.swing.JLabel();
        back_to_customer_screen_button = new javax.swing.JButton();
        email_label = new javax.swing.JLabel();
        emai_textField = new javax.swing.JTextField();
        old_password_label = new javax.swing.JLabel();
        old_password_textField = new javax.swing.JPasswordField();
        new_password_label = new javax.swing.JLabel();
        new_password_textField = new javax.swing.JPasswordField();
        confirm_password_label = new javax.swing.JLabel();
        confirm_password_textField = new javax.swing.JPasswordField();
        city_label = new javax.swing.JLabel();
        city_textField = new javax.swing.JTextField();
        street_label = new javax.swing.JLabel();
        street_textField = new javax.swing.JTextField();
        street_number_label = new javax.swing.JLabel();
        street_number_textField = new javax.swing.JTextField();
        postal_code_label = new javax.swing.JLabel();
        postal_code_textField = new javax.swing.JTextField();
        phone_number_label = new javax.swing.JLabel();
        phone_number_textField = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        name_textField = new javax.swing.JTextField();
        surname_label = new javax.swing.JLabel();
        surname_textField = new javax.swing.JTextField();
        country_label = new javax.swing.JLabel();
        country_textField = new javax.swing.JTextField();
        subscription_label = new javax.swing.JLabel();
        subscription_textField = new javax.swing.JTextField();
        error_message_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings screen");
        setMinimumSize(new java.awt.Dimension(480, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        settingsScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        settingsScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        settingsScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsScreen_welcomeLabel.setText("T&D");

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

        email_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email:");

        emai_textField.setBackground(new java.awt.Color(204, 204, 204));

        old_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        old_password_label.setForeground(new java.awt.Color(255, 255, 255));
        old_password_label.setText("Old password:");

        old_password_textField.setBackground(new java.awt.Color(204, 204, 204));

        new_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        new_password_label.setForeground(new java.awt.Color(255, 255, 255));
        new_password_label.setText("New password:");

        new_password_textField.setBackground(new java.awt.Color(204, 204, 204));

        confirm_password_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirm_password_label.setForeground(new java.awt.Color(255, 255, 255));
        confirm_password_label.setText("Confirm password:");

        confirm_password_textField.setBackground(new java.awt.Color(204, 204, 204));

        city_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        city_label.setForeground(new java.awt.Color(255, 255, 255));
        city_label.setText("City:");

        city_textField.setBackground(new java.awt.Color(204, 204, 204));
        city_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_textFieldActionPerformed(evt);
            }
        });

        street_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        street_label.setForeground(new java.awt.Color(255, 255, 255));
        street_label.setText("Street:");

        street_textField.setBackground(new java.awt.Color(204, 204, 204));
        street_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_textFieldActionPerformed(evt);
            }
        });

        street_number_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        street_number_label.setForeground(new java.awt.Color(255, 255, 255));
        street_number_label.setText("Street number:");

        street_number_textField.setBackground(new java.awt.Color(204, 204, 204));
        street_number_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_number_textFieldActionPerformed(evt);
            }
        });

        postal_code_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        postal_code_label.setForeground(new java.awt.Color(255, 255, 255));
        postal_code_label.setText("Postal code:");

        postal_code_textField.setBackground(new java.awt.Color(204, 204, 204));
        postal_code_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postal_code_textFieldActionPerformed(evt);
            }
        });

        phone_number_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phone_number_label.setForeground(new java.awt.Color(255, 255, 255));
        phone_number_label.setText("Phone number:");

        phone_number_textField.setBackground(new java.awt.Color(204, 204, 204));
        phone_number_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_number_textFieldActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setText("Name:");

        name_textField.setBackground(new java.awt.Color(204, 204, 204));
        name_textField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        surname_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surname_label.setForeground(new java.awt.Color(255, 255, 255));
        surname_label.setText("Surname:");

        surname_textField.setBackground(new java.awt.Color(204, 204, 204));
        surname_textField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        country_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        country_label.setForeground(new java.awt.Color(255, 255, 255));
        country_label.setText("Country:");

        country_textField.setBackground(new java.awt.Color(204, 204, 204));
        country_textField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        subscription_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subscription_label.setForeground(new java.awt.Color(255, 255, 255));
        subscription_label.setText("Subscription:");

        subscription_textField.setBackground(new java.awt.Color(204, 204, 204));
        subscription_textField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        error_message_label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        error_message_label.setForeground(new java.awt.Color(191, 0, 0));
        error_message_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(191, 0, 0));
        jButton1.setText("Update");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(phone_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(error_message_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phone_number_label)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(email_label, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(old_password_textField)
                                                .addComponent(emai_textField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(old_password_label)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(new_password_label, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(confirm_password_textField)
                                                .addComponent(new_password_textField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(confirm_password_label))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(country_label)
                                    .addComponent(surname_label)
                                    .addComponent(name_label)
                                    .addComponent(subscription_label)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(subscription_textField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(name_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(surname_textField)
                                            .addComponent(country_textField)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(settingsScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back_to_customer_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(street_label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(street_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(city_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(city_label, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(postal_code_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(street_number_textField))
                                            .addComponent(street_number_label)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(postal_code_label)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_to_customer_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(settingsScreen_welcomeLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emai_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old_password_label)
                    .addComponent(surname_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(old_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_password_label)
                    .addComponent(country_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_password_label)
                    .addComponent(subscription_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subscription_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(city_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(street_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(street_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(street_number_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(street_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(postal_code_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postal_code_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phone_number_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phone_number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error_message_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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
        customerScreen(current_signed_in_customer);
    }//GEN-LAST:event_back_to_customer_screen_buttonActionPerformed

    private void city_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_textFieldActionPerformed

    private void street_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_street_textFieldActionPerformed

    private void street_number_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_number_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_street_number_textFieldActionPerformed

    private void postal_code_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postal_code_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postal_code_textFieldActionPerformed

    private void phone_number_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_number_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_number_textFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String old_password_check = "";
        try {
            old_password_check = encryptPassword(old_password_textField.getText());
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(SettingsScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(SettingsScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(old_password_check.equals(current_signed_in_customer.getCustomerPassword())) {

            String query = "UPDATE customer SET email=?, password=?, street_number=?, street=?, city=?, postal_code=?, phone_number=? WHERE email=?";
            boolean is_new_password_ok = true;
            error_message_label.setText("");
            //check if customer wants to change password
            if((!new_password_textField.getText().equals("")) || (!confirm_password_textField.getText().equals(""))) {

                if(new_password_textField.getText().length() < 8) {
                    error_message_label.setText("New password must be at least 8 characters!");
                    is_new_password_ok = false;
                    new_password_textField.setBackground(new Color(191, 0, 0));
                } else if(!(new_password_textField.getText().equals(confirm_password_textField.getText()))) {
                    error_message_label.setText("New and confirm passwords must be identical!");
                    is_new_password_ok = false;
                    new_password_textField.setBackground(new Color(191, 0, 0));
                } 
            }

            if(is_new_password_ok) {

                if(SettingsScreenNoMissingField()) { //check if any field is empty
                    String password_to_be_inserted = "";
                    if(!new_password_textField.getText().equals("")) {
                        try {
                            password_to_be_inserted = encryptPassword(new_password_textField.getText());
                        } catch (InvalidKeySpecException ex) {
                            Logger.getLogger(SettingsScreen.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (NoSuchAlgorithmException ex) {
                            Logger.getLogger(SettingsScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        
                        password_to_be_inserted = current_signed_in_customer.getCustomerPassword(); //keep same password
                    } 
                    
                    Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
                    PreparedStatement pst;
                    try {
                        pst = conn.prepareStatement(query);
                        pst.setString (1, emai_textField.getText());
                        pst.setString (2, password_to_be_inserted);
                        pst.setInt (3, Integer.parseInt(street_number_textField.getText()));
                        pst.setString (4, street_textField.getText());
                        pst.setString (5, city_textField.getText());
                        pst.setInt (6, Integer.parseInt(postal_code_textField.getText()));
                        pst.setString (7, phone_number_textField.getText());
                        pst.setString (8, current_signed_in_customer.getCustomerEmail());
                        pst.execute();
                        conn.close();
                        JOptionPane.showMessageDialog(null, "Succesful update!");
                        customerScreen(current_signed_in_customer);
                    }
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }

            }

        } 
    } else {
        old_password_textField.setBackground(new Color(191, 0, 0));
        error_message_label.setText("Old password is not correct!");
    }
}//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_customer_screen_button;
    private javax.swing.JLabel city_label;
    private javax.swing.JTextField city_textField;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JPasswordField confirm_password_textField;
    private javax.swing.JLabel country_label;
    private javax.swing.JTextField country_textField;
    private javax.swing.JTextField emai_textField;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel error_message_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textField;
    private javax.swing.JLabel new_password_label;
    private javax.swing.JPasswordField new_password_textField;
    private javax.swing.JLabel old_password_label;
    private javax.swing.JPasswordField old_password_textField;
    private javax.swing.JLabel phone_number_label;
    private javax.swing.JTextField phone_number_textField;
    private javax.swing.JLabel postal_code_label;
    private javax.swing.JTextField postal_code_textField;
    private javax.swing.JLabel street_label;
    private javax.swing.JLabel street_number_label;
    private javax.swing.JTextField street_number_textField;
    private javax.swing.JTextField street_textField;
    private javax.swing.JLabel subscription_label;
    private javax.swing.JTextField subscription_textField;
    private javax.swing.JLabel surname_label;
    private javax.swing.JTextField surname_textField;
    // End of variables declaration//GEN-END:variables
}
