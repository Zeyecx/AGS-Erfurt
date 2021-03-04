
package bank;

/**
 *
 * @author Barthyr
 */

public class Konto {
    
   
    public Konto(){};
    
    public void zahleEin(int typ, Double c){
      if(typ != 0){
          if(new SparKonto().KtoNr!=-1){
              new SparKonto().KtoStand += c;
          }else{
              new Interface().nokonto(typ);
          }
      }else{
          if(new GiroKonto().KtoNr!=-1){
              new GiroKonto().KtoStand += c;
          }else{
              new Interface().nokonto(typ);
          }
      }
        
    }
    
    public void zahleAus(int typ, Double c){
      if(typ != 0){
          if(new SparKonto().KtoNr!=-1){
              if(new SparKonto().KtoStand-c<=0){
                  new Interface().nomoney(typ);
              } else {
                  new SparKonto().KtoStand -= c;
              }
          }else{
              new Interface().nokonto(typ);
          }
      }else{
          if(new GiroKonto().KtoNr!=-1){
              if((new GiroKonto().KtoStand+new GiroKonto().Dispolimit)-c>0){
                  new GiroKonto().KtoStand -= c;
              }else{
                  new Interface().nomoney(typ);
              }
          }else{
              new Interface().nokonto(typ);
          }
      }
        
    }
    
    public void verzinse(Double c){
     if(new SparKonto().KtoNr!=-1){
              new SparKonto().KtoStand = new SparKonto().KtoStand * new SparKonto().Zinssatz;
          }else{
              new Interface().nokonto(1);
     }
    }
    public void anlegen(int typ){
        if(typ == 0){
            new GiroKonto().Name = new Interface().eingabe("Bitte geben Sie ihren Namen ein","Girokonto anlegen");
            new GiroKonto().Vorname = new Interface().eingabe("Bitte geben Sie ihren Vornamen ein","Girokonto anlegen");
            new GiroKonto().KtoStand = 0;
            new GiroKonto().Dispolimit = new Interface().double_eingabe("Bitte geben Sie den aktuellen Dispolimit ein", "Girokonto anlegen") / 100;
            new GiroKonto().KtoNr = new Interface().id();
        }else{
            new SparKonto().Name = new Interface().eingabe("Bitte geben Sie ihren Namen ein","Sparkonto anlegen");
            new SparKonto().Vorname = new Interface().eingabe("Bitte geben Sie ihren Vornamen ein","Sparkonto anlegen");
            new SparKonto().KtoStand = 0;
            new SparKonto().Zinssatz = new Interface().double_eingabe("Bitte geben Sie den aktuellen Zinssatz ein", "Sparkonto anlegen") / 100;
            new SparKonto().KtoNr = new Interface().id();
        }   
    }
    
    public void drucken(int typ){
       String n = "\n";
        if(typ == 0){ 
           if(new GiroKonto().KtoNr!=-1){
               new Interface().Ausgabe("Ihr Konto:"+n+"Name: "+new GiroKonto().Name+n+"Vorname: "+new GiroKonto().Vorname+n+"Dispogrenze: "+new GiroKonto().Dispolimit+"€"+n+"Kontostand: "+new GiroKonto().KtoStand+"€"+n+"Kontonummer: "+new GiroKonto().KtoNr, "Girokonto");
           }else{
               new Interface().nokonto(typ);
           }
        }else{
            if(new SparKonto().KtoNr!=-1){ 
                new Interface().Ausgabe("Ihr Konto:"+n+"Name: "+new SparKonto().Name+n+"Vorname: "+new SparKonto().Vorname+n+"Zinssatz: "+new SparKonto().Zinssatz+"%"+n+"Kontostand: "+new SparKonto().KtoStand+"€"+n+"Kontonummer: "+new SparKonto().KtoNr, "Sparkonto"); 
            }else{
                new Interface().nokonto(typ);
            }
       }
    }    
    
    public void setzeDispo(){
        if(new GiroKonto().KtoNr!=-1){
            new GiroKonto().Dispolimit = 0 - new Interface().double_eingabe("Bitte geben sie ihre freigrenze ein.(0<=x<=++)", "Girokonto");
        }else{
            new Interface().nokonto(0);
        }    
    }
    
    public void buchung(){
        if(new GiroKonto().KtoNr != -1 && new SparKonto().KtoNr != -1){
           Double betrag = new Interface().double_eingabe("Wie viel wollen Sie buchen", "Buchung");
           new Interface().Ausgabe("Von", "Baum");
           if(new Interface().choose("Girokonto", "Sparkonto") == 0){
               if(new Interface().test(0, betrag)){
                   zahleEin(1, betrag);
                   zahleAus(0, betrag);
               }else{
                   new Interface().nomoney(0);
               }
               if(new Interface().test(1, betrag)){
                   zahleEin(0, betrag);
                   zahleAus(1, betrag);
               }else{
                   new Interface().nomoney(1);
               }
           }
            
        }else{
            new Interface().Ausgabe("Kein Konto vorhanden", "Konto Fehler");
        }
    }
    
    
}
