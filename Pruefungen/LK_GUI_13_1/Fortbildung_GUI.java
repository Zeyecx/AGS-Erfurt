
/**
 * @author Barthyr
 */

public class Fortbildung_GUI extends javax.swing.JFrame {

    /* obj anlegen */
    core c = new core();

    /**
     * Creates new form Fortbildung_GUI
     */
    public Fortbildung_GUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Dauer_Betrieb = new javax.swing.JLabel();
        anz = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        berechnen = new java.awt.Button();
        Löschen = new java.awt.Button();
        Ende = new java.awt.Button();
        Dauer = new java.awt.TextField();
        Anzahl = new java.awt.TextField();
        Prämie = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Fortbildungsprämie");

        Dauer_Betrieb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dauer_Betrieb.setText("Dauer der Betriebszugehöigkeit:");

        anz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        anz.setText("Anzahl der Fortbildngen: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prämie:");

        berechnen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        berechnen.setLabel("Berechnen");
        berechnen.setName("Berechnen"); // NOI18N
        berechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berechnenActionPerformed(evt);
            }
        });

        Löschen.setActionCommand("Löschen");
        Löschen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Löschen.setLabel("Löschen");
        Löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LöschenActionPerformed(evt);
            }
        });

        Ende.setActionCommand("Ende");
        Ende.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ende.setLabel("Ende");
        Ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndeActionPerformed(evt);
            }
        });

        Dauer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Dauer.setName("Dauer"); // NOI18N

        Anzahl.setName("Anzahl"); // NOI18N

        Prämie.setName("Prämie"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dauer_Betrieb)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anz, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Anzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prämie, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dauer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Dauer_Betrieb)
                        .addGap(18, 18, 18)
                        .addComponent(anz)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(Dauer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Anzahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Prämie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        berechnen.getAccessibleContext().setAccessibleDescription("Berechnen");
        Ende.getAccessibleContext().setAccessibleName("Ende");
        Ende.getAccessibleContext().setAccessibleDescription("Ende");
        Dauer.getAccessibleContext().setAccessibleName("Dauer");
        Dauer.getAccessibleContext().setAccessibleDescription("Dauer");
        Anzahl.getAccessibleContext().setAccessibleName("Anzahl");
        Anzahl.getAccessibleContext().setAccessibleDescription("Anzahl");
        Prämie.getAccessibleContext().setAccessibleName("Prämie");
        Prämie.getAccessibleContext().setAccessibleDescription("Prämie");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0); // level 0 als normales Ende ^^
    }//GEN-LAST:event_EndeActionPerformed

    private void LöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LöschenActionPerformed
        Anzahl.setText("");
        Dauer.setText("");
        Prämie.setText("");
    }//GEN-LAST:event_LöschenActionPerformed

    private void berechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnenActionPerformed
        Prämie.setText(String.valueOf(c.zuschlag(Integer.parseInt(Dauer.getText()), Integer.parseInt(Anzahl.getText()))));
    }//GEN-LAST:event_berechnenActionPerformed
    
    public static void main(String args[]) {
        /* Steuerargumente überschreiben */
        if (args.length != 0) {
            args = null;
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fortbildung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fortbildung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fortbildung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fortbildung_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fortbildung_GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField Anzahl;
    private java.awt.TextField Dauer;
    private javax.swing.JLabel Dauer_Betrieb;
    private java.awt.Button Ende;
    private java.awt.Button Löschen;
    private java.awt.TextField Prämie;
    private javax.swing.JLabel anz;
    private java.awt.Button berechnen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
