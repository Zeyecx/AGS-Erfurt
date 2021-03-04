package passwort;

/**
 * @author Barthyr
 */

public class TFSchulnetzwerk extends javax.swing.JFrame {
 TSchulkonten d = new TSchulkonten(); 
 
    public TFSchulnetzwerk() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ordner_Aufgabenstellung = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        access = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        Benutzer = new javax.swing.JPanel();
        Name_field = new javax.swing.JLabel();
        PWD_field = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anmeldung im Schulnetz");

        Ordner_Aufgabenstellung.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordner Aufgabenstelllung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        register.setText("Anmelden");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Ordner_AufgabenstellungLayout = new javax.swing.GroupLayout(Ordner_Aufgabenstellung);
        Ordner_Aufgabenstellung.setLayout(Ordner_AufgabenstellungLayout);
        Ordner_AufgabenstellungLayout.setHorizontalGroup(
            Ordner_AufgabenstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ordner_AufgabenstellungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ordner_AufgabenstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(access)
                    .addComponent(value))
                .addGap(25, 25, 25)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        Ordner_AufgabenstellungLayout.setVerticalGroup(
            Ordner_AufgabenstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Ordner_AufgabenstellungLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(Ordner_AufgabenstellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Ordner_AufgabenstellungLayout.createSequentialGroup()
                        .addComponent(access)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(value))
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        Benutzer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Benutzer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Name_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name_field.setText("Name:");

        PWD_field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PWD_field.setText("Passwort:");

        javax.swing.GroupLayout BenutzerLayout = new javax.swing.GroupLayout(Benutzer);
        Benutzer.setLayout(BenutzerLayout);
        BenutzerLayout.setHorizontalGroup(
            BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenutzerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name_field)
                    .addComponent(PWD_field))
                .addGap(34, 34, 34)
                .addGroup(BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        BenutzerLayout.setVerticalGroup(
            BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenutzerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_field)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BenutzerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PWD_field)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ordner_Aufgabenstellung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Benutzer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(Benutzer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Ordner_Aufgabenstellung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       // Button anmelden
        // Button verschwinden
           register.setVisible(false); 
        // Textfelder auslesen
            String Benutzername = Name.getText();
            String Passwort = pass.getText();
        // anmelden
        if(d.anmelden(Benutzername, Passwort) != null){
            // Anmeldung erfolgreich
            access.setText("Zugriffsberechtigungen");
            // boolean to String
                String x = "";
                if(d.anmelden(Benutzername, Passwort).zLeseberechtigung){
                    x += "Lesen ";
                }
                if(d.anmelden(Benutzername, Passwort).zSchreibberechtigung){
                    x += "Schreiben ";
                }
                if(d.anmelden(Benutzername, Passwort).zVollzugriff){
                    x += "Vollzugriff ";
                }
                value.setText(x);
        }else{
            // Anmeldung Fehlerhaft
            access.setText("Anmeldung fehlgeschlagen!");
            value.setText("\t");
        }
    }//GEN-LAST:event_registerActionPerformed

    public static void main(String args[]) {
        // Löschen der Steuerargumente
        if(args.length != 0){
            args = null;
        }
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.exit(0);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TFSchulnetzwerk().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Benutzer;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_field;
    private javax.swing.JPanel Ordner_Aufgabenstellung;
    private javax.swing.JLabel PWD_field;
    private javax.swing.JLabel access;
    private javax.swing.JTextField pass;
    private javax.swing.JButton register;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
