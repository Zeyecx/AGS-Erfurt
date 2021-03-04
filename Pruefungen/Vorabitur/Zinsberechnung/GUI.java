package VorAbi;

/**
 * @see Vorprüfung Technik; BG15DV
 * @author Skopp, Jonathan
 * @serial 50 Pkt (15 Notenpunkte)
 */
public class GUI extends javax.swing.JFrame {

    Zinsverwaltung y = new Zinsverwaltung();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        auswahl(1);
    }

    private void auswahl(int picker_option) {
        switch (picker_option) {
            case 0:
                ger.setSelected(false);
                euo.setSelected(true);
                break;
            case 1:
                ger.setSelected(true);
                euo.setSelected(false);
                break;
            default:
                System.exit(8);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kaptial_text = new javax.swing.JLabel();
        Zinssatz_text = new javax.swing.JLabel();
        Anlagedauer_text = new javax.swing.JLabel();
        Zinsen_text = new javax.swing.JLabel();
        berechnen = new javax.swing.JButton();
        übernehmen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        ger = new javax.swing.JRadioButton();
        euo = new javax.swing.JRadioButton();
        Kapital = new javax.swing.JTextField();
        Zinssatz = new javax.swing.JTextField();
        Anlagedauer = new javax.swing.JTextField();
        Zinsen = new javax.swing.JTextField();
        Ende = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zinsberechnung");

        kaptial_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kaptial_text.setText("Kapital: ");

        Zinssatz_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Zinssatz_text.setText("Zinssatz:");

        Anlagedauer_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Anlagedauer_text.setText("Anlagedauer in Tagen:");

        Zinsen_text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Zinsen_text.setText("Zinsen:");

        berechnen.setText("berechnen");
        berechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berechnenActionPerformed(evt);
            }
        });

        übernehmen.setText("übernehmen");
        übernehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                übernehmenActionPerformed(evt);
            }
        });

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Zinsmethode"));

        ger.setText("Deutsche Methode");
        ger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerMouseClicked(evt);
            }
        });

        euo.setText("Euromethode");
        euo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                euoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(euo)
                    .addComponent(ger))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(euo)
                .addGap(49, 49, 49))
        );

        Zinsen.setEditable(false);
        Zinsen.setBackground(new java.awt.Color(204, 204, 204));

        Ende.setText("Ende");
        Ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kaptial_text)
                            .addComponent(Zinssatz_text)
                            .addComponent(Anlagedauer_text)
                            .addComponent(Zinsen_text))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Zinsen, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(Anlagedauer)
                            .addComponent(Kapital)
                            .addComponent(Zinssatz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(berechnen)
                                .addGap(62, 62, 62)
                                .addComponent(übernehmen))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Ende)))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kaptial_text)
                            .addComponent(Kapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zinssatz_text)
                            .addComponent(Zinssatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Anlagedauer_text)
                            .addComponent(Anlagedauer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Zinsen_text)
                            .addComponent(Zinsen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berechnen)
                    .addComponent(übernehmen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Ende)
                        .addGap(83, 83, 83))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EndeActionPerformed
    private void euoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_euoMouseClicked
        if (ger.isSelected()) {
            ger.setSelected(false);
        }

        euo.setSelected(true);
    }//GEN-LAST:event_euoMouseClicked

    private void gerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerMouseClicked
        if (euo.isSelected()) {
            euo.setSelected(false);
        }

        ger.setSelected(true);
    }//GEN-LAST:event_gerMouseClicked

    private void berechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnenActionPerformed
        Zinsen.setText(calc());
    }//GEN-LAST:event_berechnenActionPerformed

    public String calc() {
        Double Kap = Double.parseDouble(Kapital.getText());
        Double dauer = Double.parseDouble(Anlagedauer.getText());
        Double satz = Double.parseDouble(Zinssatz.getText());
        if (ger.isSelected()) {
            return String.valueOf(Kap * dauer * satz / 100 / 360);
        } else {
            return String.valueOf(Kap * dauer * satz / 100 / 365);
        }

    }

    private void übernehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_übernehmenActionPerformed
        text.append(calc() + "\n");
    }//GEN-LAST:event_übernehmenActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anlagedauer;
    private javax.swing.JLabel Anlagedauer_text;
    private javax.swing.JButton Ende;
    private javax.swing.JTextField Kapital;
    private javax.swing.JTextField Zinsen;
    private javax.swing.JLabel Zinsen_text;
    private javax.swing.JTextField Zinssatz;
    private javax.swing.JLabel Zinssatz_text;
    private javax.swing.JButton berechnen;
    private javax.swing.JRadioButton euo;
    private javax.swing.JRadioButton ger;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kaptial_text;
    private javax.swing.JTextArea text;
    private javax.swing.JButton übernehmen;
    // End of variables declaration//GEN-END:variables
}
