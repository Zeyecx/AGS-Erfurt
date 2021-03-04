import javax.swing.JOptionPane;


/* @author bg15dv-jskopp */

public class Try {

 
    public static void main(String[] args) {
   
     int a = Integer.parseInt(JOptionPane.showInputDialog("a=")); /* Eingabe der Variabeln */
     int b = Integer.parseInt(JOptionPane.showInputDialog("a="));
     int c = 0;
     
     try{ /* starte Fehler abfrage */
      
         c = a/b; /* Division durch 0 ist nicht möglich */
     
     } catch (ArithmeticException e)  /* Fehler Code*/ {
        
         System.out.println("Fehler\n Die Division durch 0 ist nicht möglich\n "+e.getMessage()); /* Fehler ausgabe*/
         
     
     } /*ENDE CATCH BLOCK*/
        
        
    }  /* ENDE PUBLIC BLOCK*/
} /* ENDE PUBLIC CLASS II */
