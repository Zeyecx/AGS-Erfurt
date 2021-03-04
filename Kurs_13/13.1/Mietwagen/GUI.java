
/** @author Barthyr */
public class GUI extends javax.swing.JFrame {

    Mietwagen m = new Mietwagen();
    String coax;

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gefahrene_km = new javax.swing.JLabel();
        Preis = new javax.swing.JLabel();
        km = new java.awt.TextField();
        price = new java.awt.TextField();
        Löschen = new java.awt.Button();
        Ende = new java.awt.Button();
        Berechnen = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Mietwagen");
        jLabel1.setToolTipText("Mietwagen");
        jLabel1.setName("Mietwagen"); // NOI18N

        gefahrene_km.setDisplayedMnemonic('d');
        gefahrene_km.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gefahrene_km.setText("gefahrene km:");
        gefahrene_km.setToolTipText("gefahrene km:");
        gefahrene_km.setName("gefahrene km:"); // NOI18N
        gefahrene_km.setOpaque(true);

        Preis.setDisplayedMnemonic('P');
        Preis.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Preis.setText("Preis:");
        Preis.setToolTipText("Preis");

        km.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        price.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        Löschen.setActionCommand("Berechnen");
        Löschen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Löschen.setLabel("Löschen");
        Löschen.setName("Löschen"); // NOI18N
        Löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LöschenActionPerformed(evt);
            }
        });

        Ende.setActionCommand("Berechnen");
        Ende.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Ende.setLabel("Ende");
        Ende.setName("Ende"); // NOI18N
        Ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndeActionPerformed(evt);
            }
        });

        Berechnen.setActionCommand("Berechnen");
        Berechnen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Berechnen.setLabel("Berechnen");
        Berechnen.setName("Berechnen"); // NOI18N
        Berechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BerechnenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gefahrene_km)
                            .addComponent(Preis))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(Berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Löschen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gefahrene_km)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Preis)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        km.getAccessibleContext().setAccessibleName("");
        km.getAccessibleContext().setAccessibleDescription("");
        Löschen.getAccessibleContext().setAccessibleDescription("Löschen");
        Ende.getAccessibleContext().setAccessibleName("Ende");
        Ende.getAccessibleContext().setAccessibleDescription("Ende");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EndeActionPerformed

    private void LöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LöschenActionPerformed
        km.setText("");
        price.setText("");
    }//GEN-LAST:event_LöschenActionPerformed

    private void BerechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BerechnenActionPerformed
        coax = Double.toString(m.berechnen(Double.parseDouble(km.getText())));
        price.setText(coax);
    }//GEN-LAST:event_BerechnenActionPerformed

    public static void main(String args[]) {

        if (args.length != 0) {
            args = null;
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Berechnen;
    private java.awt.Button Ende;
    private java.awt.Button Löschen;
    private javax.swing.JLabel Preis;
    private javax.swing.JLabel gefahrene_km;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField km;
    private java.awt.TextField price;
    // End of variables declaration//GEN-END:variables
}
