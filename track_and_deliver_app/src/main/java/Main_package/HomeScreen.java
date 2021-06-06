
package Main_package;

public class HomeScreen extends javax.swing.JFrame {

    
    public HomeScreen() {
        initComponents();
    }

    
    //methods
    public void signUp() {
        //show sugnUp window
    }
    public void signIn() {
        
        dispose();
        new SignInScreen().setVisible(true);
        
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
        singUp_button.setText("Sing up");
        singUp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUp_buttonActionPerformed(evt);
            }
        });

        signIn_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signIn_button.setText("Sign in");
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
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout homeScreen_panelLayout = new javax.swing.GroupLayout(homeScreen_panel);
        homeScreen_panel.setLayout(homeScreen_panelLayout);
        homeScreen_panelLayout.setHorizontalGroup(
            homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreen_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(homeScreen_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(homeScreen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(signIn_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singUp_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        homeScreen_panelLayout.setVerticalGroup(
            homeScreen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeScreen_panelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(homeScreen_welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(signIn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(singUp_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeScreen_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeScreen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singUp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUp_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singUp_buttonActionPerformed

    private void signIn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signIn_buttonActionPerformed
        //show sign in screen
        signIn();
        
    }//GEN-LAST:event_signIn_buttonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new HomeScreen().setVisible(true);
        });
    }
    
    //Initial app screen to choose register or singIn
 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homeScreen_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton signIn_button;
    private javax.swing.JButton singUp_button;
    // End of variables declaration//GEN-END:variables
}





//public Login_GUI() {
//        setResizable(false);
//        initComponents();
//        setDate();
//    }