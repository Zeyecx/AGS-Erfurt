package strom;

/* @author BG15DV-JNAGY; BG15DV2-FELLRICH */
import javax.swing.*;


public class Strom {
    
    public static void main(String[] args){
        
        double sm = 0.0;
        double Vp = 0.0;
        double Gp = 0.0;
        double Pr = 0.0;
        double Pr3 = Pr;
        double Pr4 = Pr;
        String eingabe = "";

        eingabe = JOptionPane.showInputDialog("Anz kWh: ");
        sm = Double.parseDouble(eingabe);

        int eingabe1 = JOptionPane.showConfirmDialog(null,
                "Möchten Sie Naturstrom?",
                "Naturstrom",
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        
        if(eingabe1 == 2){
          System.exit(0); 
        }

        if(eingabe1 == 3){
            if(sm < 1000){

                Vp = 0.2726;
                Gp = 5.40;

            } else if((1000 <= sm) && (sm < 3000)){

                Vp = 0.2613;
                Gp = 6.33;

            } else if(sm >= 3000){

                Vp = 0.2434;
                Gp = 10.83;

            }
        }

        if(eingabe1 == 0){
            if(sm < 1000){

                Vp = 0.2726;
                Gp = 6.40;

            } else if((1000 <= sm) && (sm < 3000)){

                Vp = 0.2613;
                Gp = 7.33;

            } else if(sm >= 3000){

                Vp = 0.2434;
                Gp = 11.83;

            }
        }
        if(eingabe1 == 2){
            System.out.println("Du hast kein Geld mehr");
            JOptionPane.showMessageDialog(null, "Dein Konto wurde leergeräumt.");

            System.exit(0);

        }
        Pr3 = Gp * 12;
        Pr4 = Vp * sm;
        Pr = Pr3 + Pr4;
        

        Object[] options = {"Volljährig", "Halbjährig", "Vierteljährig", "Monatlich"};
        int selected = JOptionPane.showOptionDialog(null,
                "Treffen Sie eine Auswahl",
                "Behzahlung",
                
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if(selected == 0){
            System.out.println("Kosten " + Pr + " €");

        }
	        if(selected == 1){
            Pr = Pr / 2;
            System.out.println("Kosten " + Pr + " €");

        }
        if(selected == 2){
            Pr = Pr / 4;
            System.out.println("Kosten " + Pr + " €");

        }
        if(selected == 3){
            Pr = Pr / 12;
            System.out.println("Kosten " + Pr + " €");

        }
        System.out.println("Vebrauchspreis     " + Vp + " €");
        System.out.println("Grundpreis     " + Gp + " €");
    }
}
