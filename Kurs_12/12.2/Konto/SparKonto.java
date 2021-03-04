package konto;

/**
 *
 * @author Barthyr
 */

public class SparKonto  {
    public int KtoNr;
    public double KtoStand;
    public double Zinssatz;
    public String Name;
    public String Vorname;
    
    Konto k = new Konto();

    // Konstruktor 
    
    public SparKonto(){
        KtoNr = -1;
        KtoStand = 0.0;
        Zinssatz = 0.0;
        Name = "";
        Vorname = "";
    }
 
    // Methoden
     public void zahleEin(){
         if(KtoNr!=-1){
             KtoStand += Konto.double_eingabe("Welchen Betrag wollen sie einzahlen? ", "Einzahlen");
         }else{
             Konto.Ausgabe("Sie haben kein Konto", "Konto Fehler");
         }
     }
     
     public void zahleAus(){
        if(KtoNr != -1){
            double Betrag = Konto.double_eingabe("Welchen Betrag wollen sie einzahlen? ", "Einzahlen");
            if(KtoStand - Betrag < 0){
                Konto.Ausgabe("Sie können nicht so viel Geld ausgeben", "Error");
            }else{
                KtoStand -= Betrag;
            }
         }else{
             Konto.Ausgabe("Sie haben kein Konto", "Konto Fehler");
        }
    }
     
    public void verzinse(){
         if(KtoNr != -1){
             KtoStand *= Zinssatz;
         }else{
                Konto.Ausgabe("Sie haben kein Konto","Konto Fehler");
         }
    }
    
    public void anlegen(){
        if(this.KtoNr == -1){
           this.Name = Konto.eingabe("Bitte geben Sie ihren Namen ein: ", "Sparkonto erstellen");
           this.Vorname = Konto.eingabe("Bitte geben Sie ihren Vornamen ein: ","Sparkonto erstellen");
           this.KtoNr = (int)(100000 + 999999 * (Math.random())); // sind eigentlich 10 Zahlen aber BigInt wird abgeschafft ;)
           this.KtoStand = Konto.double_eingabe("Bitte geben Sie den Startwert ein", "Sparkonto anlegen");
           this.Zinssatz = Konto.double_eingabe("Bitte geben Sie den aktuellen Zinssatz ein: ", "Sparkonto anlegen") / 100;
        }else{
            Konto.Ausgabe("Sie haben schon ein Konto. Möchten Sie es löschen?", "Fehler");
            if(Konto.choose("Ja", "Nein") == 0){
                this.Name = null;
                this.Vorname = null;
                this.KtoNr = -1;
                this.Zinssatz = 0.0;
                this.KtoStand = 0.0;
            }
            
        }
       
    }
    
    public void drucken(){
        String l = "\n"; // lb 
        String c = "€"; // currency
        if(this.KtoNr != -1){
            Konto.Ausgabe("Kontonummer:"+this.KtoNr+l+"Name: "+l+"Vorname: "+this.Vorname+l+"Kontostand:"+this.KtoStand+c+l+"Zinssatz"+(this.Zinssatz*100)+"%","Sparkonto");
        }else{
            Konto.Ausgabe("Sie besitzen noch kein Konto", "Fehler");
        }    
    }
    
    public void buchen(){
         double Betrag = Konto.double_eingabe("Welchen Betrag wollen sie buchen? ", "Buchung");
         if(this.KtoStand  - Betrag > 0) {
            this.KtoStand -= Betrag;
            new GiroKonto().KtoStand += Betrag; 
         }
    }
}
