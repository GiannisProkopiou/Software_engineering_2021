
package Main_package;


public class CustomerHomeScreen extends javax.swing.JFrame {


    public CustomerHomeScreen() {
        initComponents();
        menuPanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        welcome_label = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        addPackageButton = new javax.swing.JButton();
        rateButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CustomerHomeScreen");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 480, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        welcome_label.setBackground(new java.awt.Color(51, 51, 51));
        welcome_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome_label.setForeground(new java.awt.Color(191, 0, 0));
        welcome_label.setText("WELCOME");

        menu_button.setBackground(new java.awt.Color(51, 51, 51));
        menu_button.setForeground(new java.awt.Color(191, 0, 0));
        menu_button.setText("=");
        menu_button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });

        menuPanel.setBackground(new java.awt.Color(102, 102, 102));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setForeground(new java.awt.Color(191, 0, 0));
        homeButton.setText("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        addPackageButton.setBackground(new java.awt.Color(51, 51, 51));
        addPackageButton.setForeground(new java.awt.Color(191, 0, 0));
        addPackageButton.setText("Add Package");
        addPackageButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addPackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPackageButtonActionPerformed(evt);
            }
        });

        rateButton.setBackground(new java.awt.Color(51, 51, 51));
        rateButton.setForeground(new java.awt.Color(191, 0, 0));
        rateButton.setText("Rate");
        rateButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(51, 51, 51));
        settingsButton.setForeground(new java.awt.Color(191, 0, 0));
        settingsButton.setText("S");
        settingsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addPackageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(settingsButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_button)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu_button)
                        .addGap(18, 18, 18)
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        new CustomerHomeScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackageButtonActionPerformed
        new AddPackageScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_addPackageButtonActionPerformed

    private void rateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateButtonActionPerformed
        new RateScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_rateButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        //Go to settings Screen
    }//GEN-LAST:event_settingsButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPackageButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JButton rateButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel welcome_label;
    // End of variables declaration//GEN-END:variables
}
