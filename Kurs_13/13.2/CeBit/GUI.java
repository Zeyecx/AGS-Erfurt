package CeBit;

/**
 * @author Barthyr
 */
public class GUI extends javax.swing.JFrame {

     public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Schüler = new javax.swing.JPanel();
        load = new javax.swing.JButton();
        liste = new java.awt.List();
        Panel_Anmelden = new javax.swing.JPanel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        f1 = new javax.swing.JCheckBox();
        e1 = new javax.swing.JCheckBox();
        f2 = new javax.swing.JCheckBox();
        e2 = new javax.swing.JCheckBox();
        e3 = new javax.swing.JCheckBox();
        f3 = new javax.swing.JCheckBox();
        e4 = new javax.swing.JCheckBox();
        f4 = new javax.swing.JCheckBox();
        f5 = new javax.swing.JCheckBox();
        e5 = new javax.swing.JCheckBox();
        e6 = new javax.swing.JCheckBox();
        f6 = new javax.swing.JCheckBox();
        f7 = new javax.swing.JCheckBox();
        e7 = new javax.swing.JCheckBox();
        Anmeldung = new javax.swing.JButton();
        gesamt_text = new javax.swing.JLabel();
        price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Schüler.setBorder(javax.swing.BorderFactory.createTitledBorder("Schüler"));

        load.setText("Schülerliste laden");

        javax.swing.GroupLayout Panel_SchülerLayout = new javax.swing.GroupLayout(Panel_Schüler);
        Panel_Schüler.setLayout(Panel_SchülerLayout);
        Panel_SchülerLayout.setHorizontalGroup(
            Panel_SchülerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SchülerLayout.createSequentialGroup()
                .addGroup(Panel_SchülerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_SchülerLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(load))
                    .addGroup(Panel_SchülerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(liste, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Panel_SchülerLayout.setVerticalGroup(
            Panel_SchülerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SchülerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(liste, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel_Anmelden.setBorder(javax.swing.BorderFactory.createTitledBorder("Anmeldung"));

        javax.swing.GroupLayout Panel_AnmeldenLayout = new javax.swing.GroupLayout(Panel_Anmelden);
        Panel_Anmelden.setLayout(Panel_AnmeldenLayout);
        Panel_AnmeldenLayout.setHorizontalGroup(
            Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(n4)
                            .addComponent(n5)
                            .addComponent(n6)
                            .addComponent(n7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e3))
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e4))
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e5))
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e6))
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e7))))
                    .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(n2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e1))
                            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                                .addComponent(f2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e2)))))
                .addGap(15, 15, 15))
        );
        Panel_AnmeldenLayout.setVerticalGroup(
            Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_AnmeldenLayout.createSequentialGroup()
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(f1))
                            .addComponent(e1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2)
                            .addComponent(e2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3)
                            .addComponent(e3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f4)
                            .addComponent(e4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(f5)
                        .addComponent(e5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f6)
                    .addComponent(e6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AnmeldenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(f7)
                        .addComponent(e7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Anmeldung.setText("Anmeldung");

        gesamt_text.setText("Gesamt: ");

        price.setMaximumSize(new java.awt.Dimension(40, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gesamt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Panel_Schüler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Anmeldung)
                        .addGap(134, 134, 134)
                        .addComponent(Panel_Anmelden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panel_Schüler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel_Anmelden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(Anmeldung)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gesamt_text, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* UNISCHTBAR
      //Alle Checkboxen und Textfelder (ausser die erste Reihe) wird versteckt
        s2.setVisible(false);        f2.setVisible(false);        e2.setVisible(false);
        s3.setVisible(false);        f3.setVisible(false);        e3.setVisible(false);
        s4.setVisible(false);        f4.setVisible(false);        e4.setVisible(false);
        s5.setVisible(false);        f5.setVisible(false);        e5.setVisible(false);
        s6.setVisible(false);        f6.setVisible(false);        e6.setVisible(false);
        s7.setVisible(false);        f7.setVisible(false);        e7.setVisible(false);
    */
     
    public static void main(String args[]) {

        // löschen der Steuerargs
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anmeldung;
    private javax.swing.JPanel Panel_Anmelden;
    private javax.swing.JPanel Panel_Schüler;
    private javax.swing.JCheckBox e1;
    private javax.swing.JCheckBox e2;
    private javax.swing.JCheckBox e3;
    private javax.swing.JCheckBox e4;
    private javax.swing.JCheckBox e5;
    private javax.swing.JCheckBox e6;
    private javax.swing.JCheckBox e7;
    private javax.swing.JCheckBox f1;
    private javax.swing.JCheckBox f2;
    private javax.swing.JCheckBox f3;
    private javax.swing.JCheckBox f4;
    private javax.swing.JCheckBox f5;
    private javax.swing.JCheckBox f6;
    private javax.swing.JCheckBox f7;
    private javax.swing.JLabel gesamt_text;
    private java.awt.List liste;
    private javax.swing.JButton load;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
