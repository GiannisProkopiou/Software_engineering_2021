
package Main_package;

import java.util.Date;
import java.util.Random;
public class AddPackageScreen extends javax.swing.JFrame {

    private Customer current_signed_in_customer;
    public AddPackageScreen(Customer current_signed_in_customer) {
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
    }
    
    //methods
    private void CustomerHomeScreen() {
        new CustomerHomeScreen(current_signed_in_customer).setVisible(true);
        dispose();
    }
    
    private Package mockPackage() {
        Random rand = new Random();
        int shipment_number = Integer.parseInt(add_package_textField.getText());
        Date estimated_delivery_date = new Date();
        
        int rand_take_away = rand.nextInt(2); //0 or 1
        boolean take_away = true ? rand_take_away == 1: false;

        Date departure_date = new Date();
        double weight = rand.nextInt(1000) + 1;

        String[] sending_companies = {"ACS", "SPEEDEX", "DHL", "GENIKI", "ELTA COURIER"};
        String sending_company = sending_companies[rand.nextInt(5)];

        String dimensions = "30x40x100";
        int delivery_attempts = rand.nextInt(10);

        Package_state state;
        int rand_package_state = rand.nextInt(3);

        switch(rand_package_state) {

            case 0:
                state = Package_state.DELIVERED;
                break;
            case 1:
                state = Package_state.IN_TRANSIT;
                break;
            default:
                state = Package_state.ON_HOLD;
                break;
        }

        Package new_package = new Package(
            shipment_number, estimated_delivery_date, take_away,
            departure_date, weight, sending_company, 
            dimensions, delivery_attempts, state
        );
        
        return new_package;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddPackage_Panel = new javax.swing.JPanel();
        javax.swing.JLabel AddPackageScreen_welcomeLabel = new javax.swing.JLabel();
        back_to_home_screen_button = new javax.swing.JButton();
        add_package_label = new javax.swing.JLabel();
        add_package_textField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Package Screen");
        setResizable(false);

        AddPackage_Panel.setBackground(new java.awt.Color(51, 51, 51));

        AddPackageScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AddPackageScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        AddPackageScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddPackageScreen_welcomeLabel.setText("T&D");

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

        add_package_label.setBackground(new java.awt.Color(51, 51, 51));
        add_package_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_package_label.setForeground(new java.awt.Color(255, 255, 255));
        add_package_label.setText("Tracking number:");

        add_package_textField.setBackground(new java.awt.Color(204, 204, 204));
        add_package_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_package_textFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPackage_PanelLayout = new javax.swing.GroupLayout(AddPackage_Panel);
        AddPackage_Panel.setLayout(AddPackage_PanelLayout);
        AddPackage_PanelLayout.setHorizontalGroup(
            AddPackage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPackageScreen_welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AddPackage_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddPackage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPackage_PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(add_package_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(AddPackage_PanelLayout.createSequentialGroup()
                        .addComponent(add_package_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(AddPackage_PanelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddPackage_PanelLayout.setVerticalGroup(
            AddPackage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPackage_PanelLayout.createSequentialGroup()
                .addComponent(back_to_home_screen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddPackageScreen_welcomeLabel)
                .addGap(75, 75, 75)
                .addComponent(add_package_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPackage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_package_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(457, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPackage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPackage_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void back_to_home_screen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_home_screen_buttonActionPerformed
        CustomerHomeScreen();
    }//GEN-LAST:event_back_to_home_screen_buttonActionPerformed

    private void add_package_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_package_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_package_textFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //create package item and insert
        mockPackage().commit(current_signed_in_customer);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPackage_Panel;
    private javax.swing.JLabel add_package_label;
    private javax.swing.JTextField add_package_textField;
    private javax.swing.JButton back_to_home_screen_button;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
