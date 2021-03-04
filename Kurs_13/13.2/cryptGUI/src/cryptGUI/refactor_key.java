package cryptGUI;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import cryptGUI.GUI.*; // lasst es mal bitte stehen :P


/**
 * @author Barthyr
 */
public class refactor_key extends javax.swing.JFrame {

    /**
     * Standartkonst.
     */
    public refactor_key() {
        initComponents();
          }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_key = new java.awt.Label();
        pub_key = new java.awt.Label();
        pub_key1 = new java.awt.Label();
        pub_key_area = new java.awt.TextField();
        priv_key_area = new java.awt.TextField();
        refresh = new javax.swing.JButton();
        kill = new javax.swing.JButton();

        setTitle("schluessel");

        show_key.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        show_key.setText("Zeige Schlüssel");

        pub_key.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pub_key.setText("Öffentlicher Schlüssel:");

        pub_key1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pub_key1.setText("Privater Schlüssel:");

        pub_key_area.setEnabled(false);

        priv_key_area.setEnabled(false);

        refresh.setText("Aktuallisieren");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        kill.setText("Beenden");
        kill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pub_key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pub_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pub_key_area, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priv_key_area, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(show_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(refresh)))
                .addGap(112, 112, 112))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(556, Short.MAX_VALUE)
                    .addComponent(kill)
                    .addGap(11, 11, 11)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refresh)
                    .addComponent(show_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pub_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pub_key_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pub_key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priv_key_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(kill)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * reloader des Schlüssels
     *
     * @param evt
     */
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        try {
            // Schlüssel laden
            priv_key_area.setText(String.valueOf(auslesen(1)));
            pub_key_area.setText(String.valueOf(auslesen(2)));
        } catch (Exception ex) {
            Logger.getLogger(refactor_key.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * ließt den Priv und den Pubkey aus einer Datei aus.
     *
     * @param i
     * @return
     * @throws Exception
     */
    public static Integer auslesen(Integer i) throws Exception {
        Integer refactor_key = 0;
        if (i == 1) {
            // Private Key lesen
            File dateiPriK = new File("priv.key");
            try (FileInputStream fileInputStream = new FileInputStream(dateiPriK)) {
                byte[] encodedPrivateKey = new byte[(int) dateiPriK.length()];
                refactor_key = fileInputStream.read(encodedPrivateKey);
            }
        } else if (i == 2) {

            // Public Key lesen   
            File dateiPubK = new File("pub.key");
            try (FileInputStream fileInputStream = new FileInputStream(dateiPubK)) {
                byte[] encodedPublicKey = new byte[(int) dateiPubK.length()];
                refactor_key = fileInputStream.read(encodedPublicKey);
            }
        }
        return refactor_key;
    }//GEN-LAST:event_refreshActionPerformed

    /**
     * Schließt das Fenster
     *
     * @param evt
     */
    private void killActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killActionPerformed
              java.awt.EventQueue.invokeLater(() -> {
            new refactor_key().setVisible(false);
        });
    }//GEN-LAST:event_killActionPerformed

    /**
     * Startet die 2. Main :P
     *
     * @param args
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(refactor_key.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(refactor_key.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(refactor_key.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(refactor_key.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kill;
    private java.awt.TextField priv_key_area;
    private java.awt.Label pub_key;
    private java.awt.Label pub_key1;
    private java.awt.TextField pub_key_area;
    private javax.swing.JButton refresh;
    private java.awt.Label show_key;
    // End of variables declaration//GEN-END:variables
}
