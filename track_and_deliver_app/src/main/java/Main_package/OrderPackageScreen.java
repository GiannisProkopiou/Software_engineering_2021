
package Main_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OrderPackageScreen extends javax.swing.JFrame {

    private Customer current_signed_in_customer;
    
    public OrderPackageScreen(Customer current_signed_in_customer) {
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
        populateComboBox();
        showOrderedPackages();
    }
    
    private void populateComboBox() {
        PackageSelector.removeAllItems();
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        ResultSet rs = null;
        String sql = "SELECT * FROM package WHERE customer_email = ? AND state=? AND shipment_number NOT IN (SELECT shipment_number FROM delivers)";
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
    
    private void showOrderedPackages() {
        
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel)orders_table.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        String sql= "SELECT delivery_man_afm, package.shipment_number, delivers.state, assignemnt_date from delivers INNER JOIN package " + 
                "WHERE delivers.shipment_number = package.shipment_number AND customer_email =?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, current_signed_in_customer.getCustomerEmail());
            rs = pst.executeQuery();
            while(rs.next()){
                row[0] = rs.getString("shipment_number");
                int delivery_man_afm = rs.getInt("delivery_man_afm");
                if(rs.wasNull())
                    row[1] = "Not scheduled";
                else {
                    String query = "SELECT name, surname FROM delivery_man WHERE afm=?";
                    PreparedStatement pst1;
                    ResultSet rs1 = null;
                    pst1 = conn.prepareStatement(query);
                    pst1.setInt(1, delivery_man_afm);
                    rs1 = pst1.executeQuery();
                    
                    if(rs1.next())
                        row[1] = rs1.getString("name") + " " + rs1.getString("surname");
                }
                    
                row[2] = rs.getString("state");
                row[3] = rs.getString("assignemnt_date");
                model.addRow(row);
            }
            conn.close();
        }
        catch(SQLException ex){
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
        jScrollPane1 = new javax.swing.JScrollPane();
        orders_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        PackageSelector.setBackground(new java.awt.Color(204, 204, 204));
        PackageSelector.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PackageSelector.setForeground(new java.awt.Color(51, 51, 51));
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

        orderPackageButton.setBackground(new java.awt.Color(51, 51, 51));
        orderPackageButton.setForeground(new java.awt.Color(191, 0, 0));
        orderPackageButton.setText("Order Package");
        orderPackageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orderPackageButton.setFocusable(false);
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

        orders_table.setBackground(new java.awt.Color(51, 51, 51));
        orders_table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orders_table.setForeground(new java.awt.Color(255, 255, 255));
        orders_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tracking number", "Delivey man", "State", "Assignement date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orders_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PackageSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(singInScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PackageSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderPackageButton)
                .addGap(195, 195, 195)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        String insert = "INSERT INTO delivers VALUES (?,?,?,?)";
        try {
            
            //Insert in delivers table
            Date date = new Date();  
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
            String strDate = formatter.format(date);
            
            pst = conn.prepareStatement(insert);
            pst.setString(1, null);
            pst.setString(2, trns_id);
            pst.setString(3, "pending");
            pst.setDate(4, java.sql.Date.valueOf(strDate));
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Package set for delivery!");
            populateComboBox();
            conn.close();
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderPackageButton;
    private javax.swing.JTable orders_table;
    // End of variables declaration//GEN-END:variables
}
