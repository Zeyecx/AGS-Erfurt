
package bank;

import java.util.concurrent.atomic.*; //
import javax.swing.JOptionPane;

/**
 *
 * @author Barthyr
 */

public class Interface{
   
    
  public int id() {
    return new AtomicInteger().getAndIncrement();
  }
  
  public String uiq(int typ){
      if(0 != typ){
       return "Sparkonto";
      }else{
        return "Girokonto";
      }
  }
  
  public void nokonto(int typ){
      Ausgabe("Sie müssen ein "+uiq(typ)+" erstellen","Kritischer Fehler");
  }
  
  public void nomoney(int typ){ 
      Ausgabe("Sie können nicht mehr Geld abbuchen als Sie besitzen","Kritischer Fehler ("+uiq(typ)+"Konto)"); 
  }
  
  public String eingabe(String content, String head){
    return JOptionPane.showInputDialog(null,content,head,JOptionPane.PLAIN_MESSAGE);
  }
  
  public Double double_eingabe(String content, String head){
    return Double.parseDouble(JOptionPane.showInputDialog(null,content,head,JOptionPane.PLAIN_MESSAGE));
  }
  
  public void Ausgabe(String content, String head){
    JOptionPane.showMessageDialog(null,content,head,JOptionPane.WARNING_MESSAGE);
  }
  
  public int choose(String o1, String o2){
    Object[] options = {o1,o2};
    return JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);
  } 
  
  public boolean test(int typ, double betrag){
     if(!uiq(typ).equals("Girokonto")){
        return new SparKonto().KtoStand - betrag > 0;
     }else{
        return (new GiroKonto().Dispolimit + new GiroKonto().KtoStand) - betrag > 0;
        }   
     }
  
  public void beenden(){
      Ausgabe("Auf Wiedersehen", "Programm beenden");
      System.exit(0);
  }
  
  public void menue(){
      Ausgabe("Herzlich  Willkommen\nbei ihrer Deutschen Bank", "Deutsche Bank");
      do{
            Object[] options = {"Girokonto anlegen","Sparkonto anlegen", "Buchung", "Ausgabe","Einzahlen","Auszahlen", "Ende"};
            int a =JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);  
            
          switch (a) {
              case 0:
                  new Konto().anlegen(0);
                  break;
              case 1:
                  new Konto().anlegen(1);
                  break;
              case 2:
                  new Konto().buchung();
                  break;
              case 3:
                 new Konto().drucken(choose("Girokonto","Sparkonto"));
                 break;
              case 4:
                  new Konto().zahleEin(choose("Girokonto","Sparkonto"),double_eingabe("Bitte geben Sie einen Betrag an","Einzahlen"));
                  break;
              case 5:
                  new Konto().zahleAus(choose("Girokonto","Sparkonto"),double_eingabe("Bitte geben Sie einen Betrag an","Auszahlen"));
                  break;
              case 6: default:
                  beenden();
                  break;
            }
      }while(true);
  }
  } 
