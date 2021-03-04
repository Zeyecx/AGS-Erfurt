
package konto;



/**
 *
 * @author Barthyr
 */

public class GiroKonto{
    
    Konto k = new Konto();
    
    public int KtoNr;
    public double KtoStand;
    public double Dispolimit;
    public String Name;
    public String Vorname;
    
    public GiroKonto(){
        KtoNr = -1;
        KtoStand = 0.0;
        Dispolimit = 0.0;
        Name = "";
        Vorname = "";
    }

    // Methoden
     public  void zahleEin(){
         if(KtoNr!=-1){
             KtoStand += Konto.double_eingabe("Welchen Betrag wollen sie einzahlen? ", "Einzahlen");
         }else{
             Konto.Ausgabe("Sie haben kein Konto", "Konto Fehler");
         }
     }
     
     public void zahleAus(){
        if(KtoNr != -1){
            double Betrag = Konto.double_eingabe("Welchen Betrag wollen sie einzahlen? ", "Einzahlen");
            if(KtoStand - Betrag + Dispolimit < 0){
                Konto.Ausgabe("Sie können nicht so viel Geld ausgeben", "Error");
            }else{
                KtoStand -= Betrag;
            }
         }else{
             Konto.Ausgabe("Sie haben kein Konto", "Konto Fehler");
        }
    }
     
     public void setzeDispo(){
         this.Dispolimit = Konto.double_eingabe("Bitte geben Sie den Dispolimit ein", "Dispolimit");
     }
   
    
    public void anlegen(){
          if(this.KtoNr == -1){
            this.Name = Konto.eingabe("Bitte geben Sie ihren Namen ein: ", "Girokonto erstellen");
            this.Vorname = Konto.eingabe("Bitte geben Sie ihren Vornamen ein: ","Girokonto erstellen");
            this.KtoNr = (int)(100000 + 999999 * (Math.random())); // sind eigentlich 10 Zahlen aber BigInt wird abgeschafft ;)
            this.KtoStand = Konto.double_eingabe("Bitte geben Sie den Startwert ein", "Girokonto anlegen");
            this.Dispolimit = Konto.double_eingabe("Bitte geben Sie den aktuellen Dispolimit ein: ", "Girokonto anlegen") ;
          }else{
              Konto.Ausgabe("Sie haben schon ein Konto. Möchten Sie es löschen?", "Fehler");
                if(Konto.choose("Ja", "Nein") == 0){
                    this.Name = null;
                    this.Vorname = null;
                    this.KtoNr = -1;
                    this.Dispolimit = 0.0;
                    this.KtoStand = 0.0;
                }    
          } 
    }
    
    /**
     *
     */
    public void drucken(){
        String l = "\n"; // lb 
        String c = "€"; // currency
        if(this.KtoNr != -1){
            Konto.Ausgabe("Kontonummer:"+KtoNr+l+"Name: "+Name+l+"Vorname: "+Vorname+l+"Kontostand:"+KtoStand+c+l+"Dispolimit: "+Dispolimit+c,"Girokonto");
        }else{
            Konto.Ausgabe("Sie besitzen noch kein Konto", "Fehler");
        }
    }
    
    public void buchen(){
         double Betrag = Konto.double_eingabe("Welchen Betrag wollen sie buchen? ", "Buchung");
         if(this.KtoStand + this.Dispolimit - Betrag > 0) {
            this.KtoStand -= Betrag;
            new SparKonto().KtoStand += Betrag; 
         }
    }
    
}
