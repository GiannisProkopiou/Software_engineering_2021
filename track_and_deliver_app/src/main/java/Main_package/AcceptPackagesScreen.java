
package Main_package;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AcceptPackagesScreen extends javax.swing.JFrame {

   private DeliveryMan current_signed_in_delivery_man;
    public AcceptPackagesScreen(DeliveryMan current_signed_in_delivery_man) {
        initComponents();
        this.current_signed_in_delivery_man = current_signed_in_delivery_man;
        populateComboBox();
    }

   //methods 
    private void deliveryManScreen() {
        new DeliveryManScreen(current_signed_in_delivery_man).setVisible(true);
        dispose();
    }
    
    private void showQRcode() {
        JFrame f = new JFrame(); //creates jframe f

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //this is your screen size

        f.setUndecorated(true); //removes the surrounding border

        ImageIcon image = new ImageIcon("leo.png"); //imports the image

        JLabel lbl = new JLabel(image); //puts the image into a jlabel

        f.getContentPane().add(lbl); //puts label inside the jframe

        f.setSize(image.getIconWidth(), image.getIconHeight()); //gets h and w of image and sets jframe to the size

        int x = (screenSize.width - f.getSize().width)/2; //These two lines are the dimensions
        int y = (screenSize.height - f.getSize().height)/2;//of the center of the screen

        f.setLocation(x, y); //sets the location of the jframe
        f.setVisible(true); //makes the jframe visible
    }
    private void populateComboBox() {
        package_acceptor.removeAllItems();
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        ResultSet rs = null;
        String sql = "SELECT * FROM delivers INNER JOIN package INNER JOIN customer WHERE customer.email = customer_email AND delivers.shipment_number = package.shipment_number AND delivery_man_afm IS NULL";
        String row;
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String shippment_num = Integer.toString(rs.getInt("shipment_number"));
                String dimensions = rs.getString("dimensions");
                String weight = Double.toString(rs.getDouble("weight"));
                String phone_number = rs.getString("phone_number");
                row = "Shipment number: "+ shippment_num + " -- " + dimensions + " -- " + weight + "kg -- Phone: " + phone_number;
                package_acceptor.addItem(row);
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
        javax.swing.JLabel singInScreen_welcomeLabel = new javax.swing.JLabel();
        back_to_home_screen_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        package_acceptor = new javax.swing.JComboBox<>();
        orderPackageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        singInScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        singInScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        singInScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        singInScreen_welcomeLabel.setText("T&D");

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

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accept packages here");

        package_acceptor.setBackground(new java.awt.Color(204, 204, 204));
        package_acceptor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        package_acceptor.setForeground(new java.awt.Color(51, 51, 51));
        package_acceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                package_acceptorActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(package_acceptor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(singInScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(orderPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(singInScreen_welcomeLabel)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(package_acceptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderPackageButton)
                .addContainerGap(412, Short.MAX_VALUE))
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
        deliveryManScreen();
    }//GEN-LAST:event_back_to_home_screen_buttonActionPerformed

    private void package_acceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_package_acceptorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_package_acceptorActionPerformed

    private void orderPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPackageButtonActionPerformed
        String trns_id  = package_acceptor.getSelectedItem().toString();
        //find shipment number
        String[] splitted = trns_id.split("--", 2);
        String[] splitted1 = splitted[0].split(":", 2);
        
        int shipment_number = Integer.parseInt(splitted1[1].trim());
        //----------------------
        Connection conn = DBconnect.GetConnection(); // creates and returns connection object;
        //----------------------
        PreparedStatement pst;
        String update = "UPDATE delivers SET delivery_man_afm=? WHERE shipment_number=?";
        try {
            
            pst = conn.prepareStatement(update);
            pst.setInt(1, current_signed_in_delivery_man.getDeliveryManAfm());
            pst.setInt(2, shipment_number);
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Package accepted successfully for delivery!");
            populateComboBox();
            showQRcode();
            conn.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_orderPackageButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_home_screen_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orderPackageButton;
    private javax.swing.JComboBox<String> package_acceptor;
    // End of variables declaration//GEN-END:variables
}
