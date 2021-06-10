
package Main_package;

import javax.swing.ImageIcon;


public class CustomerHomeScreen extends javax.swing.JFrame {

    private Customer current_signed_in_customer;
    //constructors
    public CustomerHomeScreen(Customer current_signed_in_customer) {
        initComponents();
        this.current_signed_in_customer = current_signed_in_customer;
        welcome_label.setText("Welcome " + current_signed_in_customer.getCustomerName() + " " + current_signed_in_customer.getCustomerSurname());
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
        historyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CustomerHomeScreen");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 480, 720));
        setMinimumSize(new java.awt.Dimension(472, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        welcome_label.setBackground(new java.awt.Color(51, 51, 51));
        welcome_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome_label.setForeground(new java.awt.Color(191, 0, 0));
        welcome_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        menu_button.setBackground(new java.awt.Color(51, 51, 51));
        menu_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu_button.setForeground(new java.awt.Color(191, 0, 0));
        menu_button.setText("Menu");
        menu_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPackageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(historyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(addPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tracking number", "Sending company", "State", "Estimated date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menu_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(welcome_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        if(menuPanel.isVisible()) {
            menuPanel.setVisible(false);
        }
        else {
            menuPanel.setVisible(true);
        }
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new CustomerHomeScreen(current_signed_in_customer).setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackageButtonActionPerformed
         new AddPackageScreen(current_signed_in_customer.getCustomerEmail()).setVisible(true);
         dispose();
    }//GEN-LAST:event_addPackageButtonActionPerformed

    private void rateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateButtonActionPerformed
        new RateScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_rateButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        //Go to settings Screen
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPackageButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menu_button;
    private javax.swing.JButton rateButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel welcome_label;
    // End of variables declaration//GEN-END:variables
}
