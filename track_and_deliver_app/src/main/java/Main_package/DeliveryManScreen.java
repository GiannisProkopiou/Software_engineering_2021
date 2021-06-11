
package Main_package;

public class DeliveryManScreen extends javax.swing.JFrame {

    private DeliveryMan current_signed_in_delivery_man;
    
    public DeliveryManScreen(DeliveryMan current_signed_in_delivery_man) {
        initComponents();
        this.current_signed_in_delivery_man = current_signed_in_delivery_man;
        welcome_label.setText("Welcome " + current_signed_in_delivery_man.getDeliveryManName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome_label = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        signOutButton = new javax.swing.JButton();
        orderPackagesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 700));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        welcome_label.setBackground(new java.awt.Color(51, 51, 51));
        welcome_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome_label.setForeground(new java.awt.Color(191, 0, 0));
        welcome_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menu_button.setBackground(new java.awt.Color(51, 51, 51));
        menu_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu_button.setForeground(new java.awt.Color(191, 0, 0));
        menu_button.setText("Menu");
        menu_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_button.setFocusable(false);
        menu_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_button.setMinimumSize(new java.awt.Dimension(127, 40));
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });

        menuPanel.setBackground(new java.awt.Color(51, 51, 51));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setForeground(new java.awt.Color(191, 0, 0));
        homeButton.setText("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(51, 51, 51));
        settingsButton.setForeground(new java.awt.Color(191, 0, 0));
        settingsButton.setText("Settings");
        settingsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        historyButton.setBackground(new java.awt.Color(51, 51, 51));
        historyButton.setForeground(new java.awt.Color(191, 0, 0));
        historyButton.setText("Archive");
        historyButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        signOutButton.setBackground(new java.awt.Color(51, 51, 51));
        signOutButton.setForeground(new java.awt.Color(191, 0, 0));
        signOutButton.setText("Sign out");
        signOutButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        orderPackagesButton.setBackground(new java.awt.Color(51, 51, 51));
        orderPackagesButton.setForeground(new java.awt.Color(191, 0, 0));
        orderPackagesButton.setText("Accept packages");
        orderPackagesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        orderPackagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPackagesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(signOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(orderPackagesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderPackagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(signOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_button, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome_label, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(639, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(275, Short.MAX_VALUE)))
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

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        if(menuPanel.isVisible()) {
            menuPanel.setVisible(false);
        }
        else {
            menuPanel.setVisible(true);
        }
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new DeliveryManScreen(current_signed_in_delivery_man).setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyButtonActionPerformed

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        new SignInScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void orderPackagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPackagesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderPackagesButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        new SettingsScreen(current_signed_in_delivery_man).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton historyButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JButton orderPackagesButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton signOutButton;
    private javax.swing.JLabel welcome_label;
    // End of variables declaration//GEN-END:variables
}
