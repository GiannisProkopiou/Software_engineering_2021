
package Main_package;


public class HomeScreen extends javax.swing.JFrame {

    
    public HomeScreen() {
        initComponents();
        signUp_individual_button.setEnabled(false);
        signUp_company_button.setEnabled(false);
    }

    
    //methods
    public void signUp() {
        new SignUpScreen().setVisible(true);
        dispose();
    }
    public void signIn() {
        
        
        new SignInScreen().setVisible(true);
        dispose();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        homeScreen_panel = new javax.swing.JPanel();
        javax.swing.JLabel homeScreen_welcomeLabel = new javax.swing.JLabel();
        singUp_button = new javax.swing.JButton();
        signIn_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        signUp_individual_button = new javax.swing.JButton();
        signUp_company_button = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Screen");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        homeScreen_panel.setBackground(new java.awt.Color(51, 51, 51));

        homeScreen_welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        homeScreen_welcomeLabel.setForeground(new java.awt.Color(191, 0, 0));
        homeScreen_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeScreen_welcomeLabel.setText("T&D");

        singUp_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        singUp_button.setText("Sign up");
        singUp_button.setFocusable(false);
        singUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUp_buttonActionPerformed(evt);
            }
        });

        signIn_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signIn_button.setText("Sign in");
        signIn_button.setFocusable(false);
        signIn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_buttonActionPerformed(evt);
            }
        });

        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("This is a desktop app created by:\n\tArsenopoulos Vasileios\n\tIliopoulou Stavroula\n\tKontarinis Apostolos\n\tProkopiou Ioannis\n\tSina Ioannis\nCreated for CEID course Software Engineering\n\n\t\t\t\t\t         Copyright© 2021\n\n\t");
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea2);

        signUp_individual_button.setBackground(new java.awt.Color(51, 51, 51));
        signUp_individual_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signUp_individual_button.setForeground(new java.awt.Color(191, 0, 0));
        signUp_individual_button.setText("Individual");
        signUp_individual_button.setFocusable(false);
        signUp_individual_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_individual_buttonActionPerformed(evt);
            }
        });

        signUp_company_button.setBackground(new java.awt.Color(51, 51, 51));
        signUp_company_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signUp_company_button.setForeground(new java.awt.Color(191, 0, 0));
        signUp_company_button.setText("Company\n");
        signUp_company_button.setFocusable(false);
        signUp_company_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUp_company_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeScreen_panelLayout = new javax.swing.GroupLayout(homeScreen_panel);
        homeScreen_panel.setLayout(homeScreen_panelLayout);
        homeScreen_panelLayout.setHorizontalGroup(
            homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreen_panelLayout.createSequentialGroup()
                .addGroup(homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeScreen_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(signIn_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(singUp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(homeScreen_panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(homeScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreen_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signUp_company_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signUp_individual_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        homeScreen_panelLayout.setVerticalGroup(
            homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreen_panelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(homeScreen_welcomeLabel)
                .addGap(63, 63, 63)
                .addComponent(signIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUp_individual_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signUp_company_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeScreen_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeScreen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUp_buttonActionPerformed

        signUp_individual_button.setEnabled(true);
    }//GEN-LAST:event_singUp_buttonActionPerformed

    private void signIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_buttonActionPerformed
        //show sign in screen
        signIn();
        
    }//GEN-LAST:event_signIn_buttonActionPerformed

    private void signUp_individual_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_individual_buttonActionPerformed
        signUp();
    }//GEN-LAST:event_signUp_individual_buttonActionPerformed

    private void signUp_company_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUp_company_buttonActionPerformed
        //signUp();
        //to be done
    }//GEN-LAST:event_signUp_company_buttonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            //new HomeScreen().setVisible(true);
            //new CustomerHomeScreen().setVisible(true);
            //new AddPackageScreen().setVisible(true);
            new SignInScreen().setVisible(true);
        });
        //testing
        /*Customer c = new Customer("apos@gmail.com", "ak12345", 14122,
        "6A", "Trikoupi", "Athens", "Greece", "Apos",
        "Konti", "6955", Subscription_state.BASIC);
        System.out.println(c.getCountry());*/
    }
    
    //Initial app screen to choose register or singIn

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeScreen_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton signIn_button;
    private javax.swing.JButton signUp_company_button;
    private javax.swing.JButton signUp_individual_button;
    private javax.swing.JButton singUp_button;
    // End of variables declaration//GEN-END:variables
}


