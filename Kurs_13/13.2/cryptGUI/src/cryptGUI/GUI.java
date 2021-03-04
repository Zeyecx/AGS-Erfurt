package cryptGUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Barthyr
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Variabeln
     */
    String input_1 = "";  // Input Strom
    String output_1 = "";  // Output Strom

    public GUI() {
     // lade Komponenten
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input_path1 = new java.awt.Label();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        head = new java.awt.Label();
        encrypt = new java.awt.Button();
        show_key = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        genkeys = new java.awt.Button();
        decrypt = new java.awt.Button();
        input_bttn = new javax.swing.JButton();
        output_bttn = new javax.swing.JButton();
        output_path = new javax.swing.JLabel();
        input_pfad = new java.awt.TextField();
        output_pfad = new java.awt.TextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verschlüsselung mit RSA");

        head.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        head.setText("Verschlüsselung mit RSA");

        encrypt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        encrypt.setLabel("Verschlüsseln");
        encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptActionPerformed(evt);
            }
        });

        show_key.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        show_key.setLabel("Zeige Schlüssel");
        show_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_keyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Input:");

        output.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        output.setText("Output:");

        genkeys.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        genkeys.setLabel("Erzeuge Schlüssel");
        genkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genkeysActionPerformed(evt);
            }
        });

        decrypt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        decrypt.setLabel("Entschlüsseln");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        input_bttn.setText("Wähle Datei");
        input_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_bttnActionPerformed(evt);
            }
        });

        output_bttn.setText("Wähle Datei");
        output_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output_bttnActionPerformed(evt);
            }
        });

        output_path.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        input_pfad.setText("Keine Datei ausgewählt");

        output_pfad.setText("Keine Datei ausgewählt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(output_path))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(25, 25, 25)
                                        .addComponent(input_pfad, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(output)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(output_pfad, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_bttn)
                                    .addComponent(output_bttn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(show_key, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genkeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_bttn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(encrypt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_pfad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(output_bttn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(output_pfad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(output))))
                .addGap(7, 7, 7)
                .addComponent(genkeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(show_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output_path)
                .addGap(30, 30, 30))
        );

        show_key.getAccessibleContext().setAccessibleName("Zeige  Schlüssel");
        show_key.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Führt den Button verschlüsseln aus.
     *
     * @param evt
     */
    private void encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptActionPerformed
        if (input_1.isEmpty() || output_1.isEmpty()) {
            try {
                core.popup(4);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            core.encrypt("pub.key", input_1, output_1);
        } catch (IOException ex) {
            try {
                core.popup(2);
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_encryptActionPerformed

    /**
     * führt den Button "Zeige Schlüssel" aus.
     *
     * @param evt
     */
    private void show_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_keyActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new refactor_key().setVisible(true);
        });
    }//GEN-LAST:event_show_keyActionPerformed

    /**
     * führt den Button generiere Schlüssel an.
     *
     * @param evt
     */
    private void genkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genkeysActionPerformed
        try {
            // TODO: refactor key (genkey ?!) 
            Process key = core.keychain();
        } catch (IOException ex) {
            System.out.print("Genkey Error in GUI");
            System.exit(0);
        }
    }//GEN-LAST:event_genkeysActionPerformed

    /**
     * Führt den Button decrypt aus.
     *
     * @param evt
     */
    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        try {
            core.decrypt("priv.key", input_1, output_1);
        } catch (IOException ex) {
            try {
                core.popup(3);
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_decryptActionPerformed

    /**
     * Führt den input Button aus.
     * @param evt
     */
    private void input_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_bttnActionPerformed
        input_1 = core.picker();
        input_pfad.setText(input_1);
    }//GEN-LAST:event_input_bttnActionPerformed
    
    /**
     * Führt den output Button aus
     * @param evt
     */
    private void output_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output_bttnActionPerformed
        output_1 = core.picker();
        output_pfad.setText(output_1);
    }//GEN-LAST:event_output_bttnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button decrypt;
    private java.awt.Button encrypt;
    private java.awt.Button genkeys;
    private java.awt.Label head;
    private javax.swing.JButton input_bttn;
    private java.awt.Label input_path1;
    private java.awt.TextField input_pfad;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel output;
    private javax.swing.JButton output_bttn;
    private javax.swing.JLabel output_path;
    private java.awt.TextField output_pfad;
    private java.awt.Button show_key;
    // End of variables declaration//GEN-END:variables
}
