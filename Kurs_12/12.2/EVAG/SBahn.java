
package evag;

import java.io.PrintStream;

/**
 * @author Barthyr
 */

public class SBahn {
    private int linie;
    private boolean modus;
    private int maxPerson;
    private int passagiere;
    
    public void set_default(){
        this.modus = false; 
        this.passagiere = 0;
        // folgendes ist nicht in der Aufgabe enthalten, wird aber der Logik halber mitgeführt.
        this.linie = (int)(Math.random() * 10) + 1; // weil keine Werte verfügbar sind
        this.maxPerson = (int)(Math.random() * 32) + 28; // weil keine Werte verfügbar sind
    }
    
   /* Setter und Getter */
    
    public void anzeigen(){
        System.out.println("Linie "+this.linie);
    }
    
    public void getPassagiere(){
         System.out.println("Anzahl der Passagiere: "+this.passagiere);
    }
    
    public void fahren(){
        // um eine Fehlermeldung zu killen wird hier mal ne Zeile mehr stehen ;) 
        if(modus == false){
            modus = true;
            System.out.println("Die Straßenbahn fährt los ");
        }else{
            System.out.println("ERROR: Die Straßenbahn fährt bereits!");
        }
    }
    
    public void halten(){
        //hier ebenso
        if(modus == true){
            modus = false;
            System.out.println("Die Straßenbahn hält an.");
        }else{
            System.out.println("ERROR: Straßenbahn steht bereits!");
        }
    }
    
    public void einsteigen(int c){
        if(this.passagiere>=0 && this.passagiere<=this.maxPerson && this.passagiere+c<=this.maxPerson){
            this.passagiere = this.passagiere + c;
            System.out.println("Die Linie "+this.linie+" ist jetzt mit "+this.passagiere+" Passagieren unterwegs");
        }else{
            System.out.println("ERROR: Zu viele Personen!");
        }
    }
    
    public void aussteigen(int c){
        if(this.passagiere>=0 && this.passagiere<=this.maxPerson && this.passagiere-c>=0){
            this.passagiere = this.passagiere + c;
            System.out.println("Die Linie "+this.linie+" ist jetzt mit "+this.passagiere+" Passagieren unterwegs");
        }else{
            System.out.println("ERROR: Personen verschwinden in einem schwarzen Loch !");
        }
    }
    
    public int get_max_pass(){
        return this.maxPerson;
    }
  }
    
    

