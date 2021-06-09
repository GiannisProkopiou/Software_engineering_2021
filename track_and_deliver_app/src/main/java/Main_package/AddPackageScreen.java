
package Main_package;

public class AddPackageScreen extends javax.swing.JFrame {

    public AddPackageScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tndLabel = new javax.swing.JLabel();
        addPackageLabel = new javax.swing.JLabel();
        addPackageButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(480, 720, 480, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        tndLabel.setBackground(new java.awt.Color(102, 102, 102));
        tndLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tndLabel.setForeground(new java.awt.Color(191, 0, 0));
        tndLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tndLabel.setText("T&D");

        addPackageLabel.setBackground(new java.awt.Color(51, 51, 51));
        addPackageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addPackageLabel.setForeground(new java.awt.Color(191, 0, 0));
        addPackageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPackageLabel.setText("Add your Package here");

        addPackageButton.setBackground(new java.awt.Color(51, 51, 51));
        addPackageButton.setForeground(new java.awt.Color(191, 0, 0));
        addPackageButton.setText("ADD");
        addPackageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPackageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tndLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPackageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(addPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(tndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addPackageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPackageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
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

    private void addPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackageButtonActionPerformed

    }//GEN-LAST:event_addPackageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addPackageButton;
    private javax.swing.JLabel addPackageLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tndLabel;
    // End of variables declaration//GEN-END:variables
}
