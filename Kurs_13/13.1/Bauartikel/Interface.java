
/**
 * @author Barthyr
 */
public class Interface extends javax.swing.JPanel {

    /* create obj */
    core c;

    public Interface() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rabattermittlung = new java.awt.Label();
        Einzelpreis = new java.awt.Label();
        Menge = new java.awt.Label();
        Rabatt = new java.awt.Label();
        Jahre = new java.awt.Label();
        amount = new java.awt.TextField();
        cost = new java.awt.TextField();
        year = new java.awt.TextField();
        discount = new java.awt.TextField();
        berechnen = new java.awt.Button();
        löschen = new java.awt.Button();
        Ende = new java.awt.Button();

        Rabattermittlung.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Rabattermittlung.setName("Rabattermittlung"); // NOI18N
        Rabattermittlung.setText("Rabattermittlung");

        Einzelpreis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Einzelpreis.setName("Einzelpreis:"); // NOI18N
        Einzelpreis.setText("Einzelpreis:");

        Menge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Menge.setName("Menge"); // NOI18N
        Menge.setText("Menge:");

        Rabatt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Rabatt.setName("Rabatt"); // NOI18N
        Rabatt.setText("Rabatt:");

        Jahre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jahre.setName("Jahre:"); // NOI18N
        Jahre.setText("Jahre:");

        cost.setName("cost"); // NOI18N

        discount.setName("discount"); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Menge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jahre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rabatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Einzelpreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rabattermittlung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(amount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rabattermittlung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berechnen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Einzelpreis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(löschen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jahre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rabatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        Rabattermittlung.getAccessibleContext().setAccessibleDescription("Rabattermittlung");
        Einzelpreis.getAccessibleContext().setAccessibleDescription("Einzelpreis:");
        Menge.getAccessibleContext().setAccessibleDescription("Menge");
        Rabatt.getAccessibleContext().setAccessibleDescription("Rabatt");
        Jahre.getAccessibleContext().setAccessibleDescription("Jahre:");
        cost.getAccessibleContext().setAccessibleName("cost");
        cost.getAccessibleContext().setAccessibleDescription("cost");
        year.getAccessibleContext().setAccessibleName("year");
        year.getAccessibleContext().setAccessibleDescription("year");
        discount.getAccessibleContext().setAccessibleName("discount");
        discount.getAccessibleContext().setAccessibleDescription("discount");
        berechnen.getAccessibleContext().setAccessibleDescription("berechnen");
        löschen.getAccessibleContext().setAccessibleDescription("löschen");
        Ende.getAccessibleContext().setAccessibleName("Ende");
        Ende.getAccessibleContext().setAccessibleDescription("Ende");
    }// </editor-fold>//GEN-END:initComponents

    private void EndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EndeActionPerformed

    private void löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschenActionPerformed
        year.setText("");
        discount.setText("");
        cost.setText("");
        amount.setText("");
    }//GEN-LAST:event_löschenActionPerformed

    private void berechnenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnenActionPerformed
        Double x[] = {Double.parseDouble(amount.getText()), Double.parseDouble(year.getText())};
        discount.setText(String.valueOf(c.rabatt(x[0], 0, x[1].intValue())));
        // Anmerkung: Da double größer ist als int funktioniert das casten nicht :) 
    }//GEN-LAST:event_berechnenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Einzelpreis;
    private java.awt.Button Ende;
    private java.awt.Label Jahre;
    private java.awt.Label Menge;
    private java.awt.Label Rabatt;
    private java.awt.Label Rabattermittlung;
    private java.awt.TextField amount;
    private java.awt.Button berechnen;
    private java.awt.TextField cost;
    private java.awt.TextField discount;
    private java.awt.Button löschen;
    private java.awt.TextField year;
    // End of variables declaration//GEN-END:variables
}
