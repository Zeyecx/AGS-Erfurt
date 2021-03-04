
package konto;

import javax.swing.JOptionPane;

/**
 *
 * @author Barthyr
 */

public class Konto {

  
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        SparKonto s = new SparKonto();
        GiroKonto g = new GiroKonto();
        
           Ausgabe("Herzlich  Willkommen\nbei ihrer Deutschen Bank", "Deutsche Bank");
      do{
            Object[] options = {"Girokonto anlegen","Sparkonto anlegen", "Buchung", "Ausgabe","Einzahlen","Auszahlen", "Ende"};
            int a =JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);  
            
          switch (a) {
              case 0:
                  g.anlegen();
                  break;
              case 1:
                  s.anlegen();
                  break;
              case 2:
                  if(0 != choose("Sparkonto","Girokonto")){
                      g.buchen();
                  }else{
                      s.buchen();
                  }
                  break;
              case 3:
                 if(0 != choose("Sparkonto","Girokonto")){
                      g.drucken();
                  }else{
                      s.drucken();
                  }
                 break;
              case 4:
                  if(0 != choose("Sparkonto","Girokonto")){
                      g.zahleEin();
                  }else{
                      s.zahleEin();
                  }
                  break;
              case 5:
                   if(0 != choose("Sparkonto","Girokonto")){
                      g.zahleAus();
                  }else{
                      s.zahleEin();
                  }
                  break;
              case 6: default:
                  System.exit(0);
                  break;
            }
      }while(true);
  }
   
    
    
    public static String eingabe(String content, String head){
    return JOptionPane.showInputDialog(null,content,head,JOptionPane.PLAIN_MESSAGE);
  }
  
    public static Double double_eingabe(String content, String head){
    return Double.parseDouble(JOptionPane.showInputDialog(null,content,head,JOptionPane.PLAIN_MESSAGE));
  }
  
    public static int choose(String o1, String o2){
    Object[] options = {o1,o2};
    return JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options, options[0]);
  } 

    public static void Ausgabe(String content, String head){
    JOptionPane.showMessageDialog(null,content,head,JOptionPane.WARNING_MESSAGE);
  }
     }
    
 