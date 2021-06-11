
package Main_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OrderPackageScreen extends javax.swing.JFrame {

    private Customer current_signed_in_customer;
    
    public OrderPackageScreen(Customer current_signed_in_customer) {
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
        populateComboBox();
    }
    
    private void populateComboBox() {
        PackageSelector.removeAllItems();
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        ResultSet rs = null;
        String sql = "SELECT * FROM package WHERE customer_email = ? AND state=?";
        String row;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, current_signed_in_customer.getCustomerEmail());
            pst.setString(2, "on_hold");
            rs = pst.executeQuery();
            while(rs.next()){
                row = rs.getString("shipment_number");
                PackageSelector.addItem(row);
            }
            conn.close();
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PackageSelector = new javax.swing.JComboBox<>();
        back_to_home_screen_button = new javax.swing.JButton();
        orderPackageButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel singInScreen_welcomeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        PackageSelector.setBackground(new java.awt.Color(102, 102, 102));
        PackageSelector.setForeground(new java.awt.Color(191, 0, 0));
        PackageSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageSelectorActionPerformed(evt);
            }
        });

        back_to_home_screen_button.setBackground(new java.awt.Color(51, 51, 51));
        back_to_home_screen_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back_to_home_screen_button.setForeground(new java.awt.Color(255, 255, 255));
        back_to_home_screen_button.setText("<");
        back_to_home_screen_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_to_home_screen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_home_screen_buttonActionPerformed(evt);
            }
        });

        orderPackageButton.setBackground(new java.awt.Color(102, 102, 102));
        orderPackageButton.setForeground(new java.awt.Color(191, 0, 0));
        orderPackageButton.setText("Order Package");
        orderPackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPackageButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Package to be delivered");

        singInScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singInScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singInScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singInScreen_welcomeLabel.setText("T&D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PackageSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(singInScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackageSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderPackageButton)
                .addContainerGap(356, Short.MAX_VALUE))
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

    private void back_to_home_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_home_screen_buttonActionPerformed
        new CustomerHomeScreen(current_signed_in_customer).setVisible(true);
        dispose();
    }//GEN-LAST:event_back_to_home_screen_buttonActionPerformed

    private void PackageSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PackageSelectorActionPerformed

    private void orderPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPackageButtonActionPerformed
        String trns_id  = PackageSelector.getSelectedItem().toString();
        String state = "in_transit";
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        String sql = "UPDATE package SET state = ? WHERE shipment_number = ?; ";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, state);
            pst.setString(2, trns_id);
            pst.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Package set for delivery!");
            populateComboBox();
            
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_orderPackageButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PackageSelector;
    private javax.swing.JButton back_to_home_screen_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orderPackageButton;
    // End of variables declaration//GEN-END:variables
}
