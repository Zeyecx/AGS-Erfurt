package zinsen;
import javax.swing.JOptionPane;


/* @author bg15dv-jskopp */
public class Zinsen {

    /* @param args the command line arguments */
    
    public static void main(String[] args) {
        
     	          
		double startKapital, zinssatz, kapital;
		double anz = Double.parseDouble(JOptionPane.showInputDialog("Anzahl der Jahre:"));
                double jahr = 1.0;
		
		System.out.println("Zinsrechner");
		System.out.println(" ");
		
                startKapital = Double.parseDouble(JOptionPane.showInputDialog("startkapital"));
                System.out.println("Startkapital (in Euro):" + startKapital);
		
                
                zinssatz = Double.parseDouble(JOptionPane.showInputDialog("Zinssatz: "));
		System.out.println("Zinssatz (in Prozent):" + zinssatz);
		
		zinssatz = zinssatz / 100;    //Prozentzahlumrechnung
		kapital = startKapital;
		System.out.println(" Jahr Kapital ");
		while(jahr <= anz){
			kapital = kapital + kapital*zinssatz;
			System.out.println(jahr + " Jahr " + kapital + "€");
			jahr++;
		}
   }
    
}
