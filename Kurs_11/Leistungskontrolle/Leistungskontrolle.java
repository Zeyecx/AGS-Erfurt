
package leistungskontrolle;
import javax.swing.*;

/** @author bg15dv-jskopp */
public class Leistungskontrolle {

    
    public static void main(String[] args) {
      class Mitarbeiter{
        Double x = 1.0;
            
                
            
            Double persNr = 0.0;
            String Name, Vorname, Anschrift = "";
            
           public void eingabe(String newName, String newVorname, String newAnschrift){
              Name = newName;
              Vorname = newVorname;
              Anschrift = newAnschrift;
           }
            
        
      } 
      class Arbeiter{
            Double Stundenlohn = 8.5;
            Double Monatsstunden = 0.0;
            Double Lohn = 0.0;
            
           public void StundenErfassen(Double neuStunden){
               Monatsstunden = neuStunden;
           }
           
           public void LohnBerechnen(){
               Lohn = Stundenlohn * Monatsstunden;
           }
            
           public Double LohnAusgeben (){ //das ist absichtlich kein VOID.
               return Lohn;
           }
            
         }
         
       class Angestellter{
            Double Gehalt = 0.0;
            
            public Double GehaltAusgeben (Double newGehalt){
                Gehalt = newGehalt;
                return Gehalt;
            }
         
         }
         
         
       class Auszubildender{ // kann entfernt werden
            Double Entgeld = 0.0; 
             
         }
        
         Mitarbeiter w = new Mitarbeiter();
         Arbeiter wo = new Arbeiter();
         Angestellter wor = new Angestellter();
         Auszubildender work = new Auszubildender();
           
         
         /* Der Block ist frei wählbar. Hier kommt dann rein wann das Programm die Fkt. aufrufen soll. Meine Variante ist da nur ein Beispiel */
         
         System.out.print("Hallo. Ich verwalte ihre Mitglieder \n");
         System.out.print("Ich lege einen neues Mitglied an. \n");
         String nname = JOptionPane.showInputDialog("Name des Mitarbeiters: ");
         String nvorname =  JOptionPane.showInputDialog("Vorname des Mitarbeiters: ");
         String nanschrift = JOptionPane.showInputDialog("Anschrift des Mitarbeiters: ");
         w.eingabe(nname, nvorname, nanschrift);
         System.out.print("Es wurde ein neuer Arbeiter hinzugefügt. \n");
         System.out.print("Wenn der neue ein Arbeiter ist \n ");
         Double nMonatsstunden = Double.parseDouble(JOptionPane.showInputDialog("Anzahl der Stunden im Monat"));
         wo.StundenErfassen(nMonatsstunden);
         wo.LohnBerechnen();
         System.out.print("Ihr Lohn " + wo.LohnAusgeben()+"€ \n");
         System.out.print("Sie sind ein Angestellter \n");
         Double newGehalt = Double.parseDouble(JOptionPane.showInputDialog("ihr Gehalt: "));
         System.out.print(wor.GehaltAusgeben(newGehalt)+"€ \n");
         
         
         
         
         
         
         
         
         
                 
    }
    
    }
    

