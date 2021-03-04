
/** @author Barthyr */
public class Interface extends javax.swing.JPanel {

    core c;    

    public Interface() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        berechnen = new javax.swing.JButton();
        löschen = new javax.swing.JButton();
        Ende = new javax.swing.JButton();
        Verkaufsumsatz = new javax.swing.JLabel();
        Fixum = new javax.swing.JLabel();
        Umsatz = new javax.swing.JTextField();
        fix = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        Gesamtkosten = new javax.swing.JLabel();

        berechnen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        berechnen.setText("berechnen");
        berechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berechnenActionPerformed(evt);
            }
        });

        löschen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        löschen.setText("löschen");
        löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschenActionPerformed(evt);
            }
        });

        Ende.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Ende.setText("Ende");
        Ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndeActionPerformed(evt);
            }
        });

        Einkommensberechnung.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Einkommensberechnung.setText("Einkommensberechnung");

        Verkaufsumsatz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Verkaufsumsatz.setText("Verkaufsumsatz:");

        Fixum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Fixum.setText("Fixum:");

        cost.setToolTipText("cost");

        Gesamtkosten.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Gesamtkosten.setText("Gesamtkosten:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Einkommensberechnung)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(löschen)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Verkaufsumsatz)
                    .addComponent(Fixum)
                    .addComponent(Gesamtkosten))
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Umsatz, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(fix)
                    .addComponent(cost))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(berechnen)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ende)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Einkommensberechnung)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verkaufsumsatz)
                    .addComponent(Umsatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berechnen))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fixum)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(löschen))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gesamtkosten)
                            .addComponent(Ende))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        berechnen.getAccessibleContext().setAccessibleDescription("berechnen");
        Einkommensberechnung.getAccessibleContext().setAccessibleDescription("Einkommensberechnung");
        Umsatz.getAccessibleContext().setAccessibleName("Umsatz");
        Umsatz.getAccessibleContext().setAccessibleDescription("Umsatz");
        fix.getAccessibleContext().setAccessibleName("fix");
        cost.getAccessibleContext().setAccessibleName("cost");
        cost.getAccessibleContext().setAccessibleDescription("cost");
    }// </editor-fold>//GEN-END:initComponents

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EndeActionPerformed

    private void löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschenActionPerformed
        fix.setText("");
        cost.setText("");
        Umsatz.setText("");
        
    }//GEN-LAST:event_löschenActionPerformed

    private void berechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnenActionPerformed
        Double u = Double.parseDouble(Umsatz.getText());
        Double f = Double.parseDouble(fix.getText());
        String content = String.valueOf(c.lohn(u, f));
        cost.setText(content);
    }//GEN-LAST:event_berechnenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected final javax.swing.JLabel Einkommensberechnung = new javax.swing.JLabel();
    private javax.swing.JButton Ende;
    private javax.swing.JLabel Fixum;
    private javax.swing.JLabel Gesamtkosten;
    private javax.swing.JTextField Umsatz;
    private javax.swing.JLabel Verkaufsumsatz;
    private javax.swing.JButton berechnen;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField fix;
    private javax.swing.JButton löschen;
    // End of variables declaration//GEN-END:variables
}
