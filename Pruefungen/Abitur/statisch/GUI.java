package skopp;

/**
 * Abiturprüfung 2k18
 *
 * @author BG15DV-JSkopp
 */
public class GUI extends javax.swing.JFrame {

    // Klopf Klopf. Wer ist da [lange Zeit später] --> Java ^^
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_gesamt = new javax.swing.JLabel();
        preis = new javax.swing.JLabel();
        Aprikose = new javax.swing.JButton();
        Avocado = new javax.swing.JButton();
        Erdbeeren = new javax.swing.JButton();
        Heidelbeeren = new javax.swing.JButton();
        Kirschen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bioladen");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label_gesamt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_gesamt.setText("gesamt:");

        preis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        preis.setText("0.0");

        Aprikose.setBackground(new java.awt.Color(0, 0, 0));
        Aprikose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprikoseActionPerformed(evt);
            }
        });

        Avocado.setBackground(new java.awt.Color(0, 0, 0));
        Avocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvocadoActionPerformed(evt);
            }
        });

        Erdbeeren.setBackground(new java.awt.Color(0, 0, 0));
        Erdbeeren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErdbeerenActionPerformed(evt);
            }
        });

        Heidelbeeren.setBackground(new java.awt.Color(0, 0, 0));
        Heidelbeeren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeidelbeerenActionPerformed(evt);
            }
        });

        Kirschen.setBackground(new java.awt.Color(0, 0, 0));
        Kirschen.setActionCommand("");
        Kirschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KirschenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aprikose)
                    .addComponent(Avocado)
                    .addComponent(Erdbeeren)
                    .addComponent(Heidelbeeren)
                    .addComponent(Kirschen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_gesamt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(preis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Aprikose)
                .addGap(25, 25, 25)
                .addComponent(Avocado)
                .addGap(25, 25, 25)
                .addComponent(Erdbeeren)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(Heidelbeeren)
                .addGap(25, 25, 25)
                .addComponent(Kirschen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_gesamt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preis, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AprikoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprikoseActionPerformed
        // Aprikose
        berechne_preis(TArtikel.liste.get(0).getPreis());
    }//GEN-LAST:event_AprikoseActionPerformed

    private void AvocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvocadoActionPerformed
        // Avocado
        berechne_preis(TArtikel.liste.get(1).getPreis());
    }//GEN-LAST:event_AvocadoActionPerformed

    private void ErdbeerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErdbeerenActionPerformed
        // Erdbeeren
        berechne_preis(TArtikel.liste.get(2).getPreis());
    }//GEN-LAST:event_ErdbeerenActionPerformed

    private void HeidelbeerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeidelbeerenActionPerformed
        //Heidelbeeren
        berechne_preis(TArtikel.liste.get(3).getPreis());
    }//GEN-LAST:event_HeidelbeerenActionPerformed

    private void KirschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KirschenActionPerformed
        // Kirschen
        berechne_preis(TArtikel.liste.get(4).getPreis());
    }//GEN-LAST:event_KirschenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
       TArtikel.auslesen();
        namen();
        malen();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });

        
    }

    /**
     * Erhalten des Preises aus dem Fenster
     * @return 
     */
    public static double get_preis() {
        return Double.parseDouble(preis.getText());
    }

    /**
     * Berechnung des Preises und deren Ausgabe
     * @param kosten 
     */
    public static void berechne_preis(double kosten) {
        preis.setText(String.valueOf(get_preis() + kosten));

    }
/**
 * Hier werden die Farben festgelegt
 */
    public static void malen() {
        Aprikose.setBackground(java.awt.Color.GREEN);
        Avocado.setBackground(java.awt.Color.BLUE);
        Erdbeeren.setBackground(java.awt.Color.CYAN);
        Heidelbeeren.setBackground(java.awt.Color.YELLOW);
        Kirschen.setBackground(java.awt.Color.red);
    }
/**
 * Hier werden die Namen festgelegt. Diese werden aus der Liste liste der Klasse TArtikel geladen
 */
    public static void namen() {
        Aprikose.setText(TArtikel.liste.get(0).getName()+ " "+TArtikel.liste.get(0).getName());
        Avocado.setText(TArtikel.liste.get(1).getName()+" "+TArtikel.liste.get(1).getName());
        Erdbeeren.setText(TArtikel.liste.get(2).getName()+" "+TArtikel.liste.get(2).getName());
        Heidelbeeren.setText(TArtikel.liste.get(3).getName()+" "+TArtikel.liste.get(3).getName());
        Kirschen.setText(TArtikel.liste.get(4).getName()+" "+TArtikel.liste.get(4).getName());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Aprikose;
    public static javax.swing.JButton Avocado;
    public static javax.swing.JButton Erdbeeren;
    public static javax.swing.JButton Heidelbeeren;
    public static javax.swing.JButton Kirschen;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel label_gesamt;
    public static javax.swing.JLabel preis;
    // End of variables declaration//GEN-END:variables
}
