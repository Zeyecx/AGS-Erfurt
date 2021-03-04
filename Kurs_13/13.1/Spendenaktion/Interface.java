
/**
 * @author Barthyr
 */
public class Interface extends javax.swing.JPanel {
    
    /* obj anlegen */
     core c;
     
     
    public Interface() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Spendenaktion = new java.awt.Label();
        berechnen = new java.awt.Button();
        löschen = new java.awt.Button();
        Ende = new java.awt.Button();
        Geld = new java.awt.TextField();
        Spende = new java.awt.TextField();
        Monatseinkommen = new java.awt.Label();
        Spendenbetrag = new java.awt.Label();

        Spendenaktion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Spendenaktion.setName("Spendenaktion"); // NOI18N
        Spendenaktion.setText("Spendenaktion");

        berechnen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        berechnen.setLabel("berechnen");
        berechnen.setName("berechnen"); // NOI18N
        berechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berechnenActionPerformed(evt);
            }
        });

        löschen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        löschen.setLabel("löschen");
        löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschenActionPerformed(evt);
            }
        });

        Ende.setActionCommand("Ende");
        Ende.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Ende.setLabel("Ende");
        Ende.setName("Ende"); // NOI18N
        Ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndeActionPerformed(evt);
            }
        });

        Geld.setName("geld"); // NOI18N

        Monatseinkommen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Monatseinkommen.setName("Monatseinkommen"); // NOI18N
        Monatseinkommen.setText("Monatseinkommen:");

        Spendenbetrag.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Spendenbetrag.setName("Spendenbetrag"); // NOI18N
        Spendenbetrag.setText("Spendenbetrag:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Spendenaktion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Monatseinkommen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Spendenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Geld, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(Spende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ende, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Spendenaktion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(Geld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Monatseinkommen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Spendenbetrag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Spendenaktion.getAccessibleContext().setAccessibleName("Spendenaktion");
        Spendenaktion.getAccessibleContext().setAccessibleDescription("Spendenaktion");
        Geld.getAccessibleContext().setAccessibleName("Geld");
        Geld.getAccessibleContext().setAccessibleDescription("Geld");
        Spende.getAccessibleContext().setAccessibleName("Spenden");
        Spende.getAccessibleContext().setAccessibleDescription("Spenden");
        Monatseinkommen.getAccessibleContext().setAccessibleDescription("Monatseinkommen");
    }// </editor-fold>//GEN-END:initComponents

    private void berechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnenActionPerformed
       Double x = Double.parseDouble(Geld.getText());
       Spende.setText(String.valueOf(c.spende(x)));
    }//GEN-LAST:event_berechnenActionPerformed

    private void löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschenActionPerformed
    Geld.setText("");
    Spende.setText("");
    }//GEN-LAST:event_löschenActionPerformed

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EndeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Ende;
    private java.awt.TextField Geld;
    private java.awt.Label Monatseinkommen;
    private java.awt.TextField Spende;
    private java.awt.Label Spendenaktion;
    private java.awt.Label Spendenbetrag;
    private java.awt.Button berechnen;
    private java.awt.Button löschen;
    // End of variables declaration//GEN-END:variables
}
