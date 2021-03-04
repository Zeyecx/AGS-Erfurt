
package notenbestimmung;

/** @author Barthyr */


public class Notenbestimmung {

    
    public static void main(String[] args) {
     
        function Function = new function();
        
        double a=0.0,b=0.0,c=0.0,d=0.0,e=0.0,f=0.0,gesamt = 0.0;
        double anz = Function.eingabe();
        
        for(int i = 0; i <= anz; i++){
            Double pkt = Function.eingabe();
            //switch ?!
            if( pkt == 10){
                Double note = 1.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                a++;
            }else if(pkt == 9 && pkt == 8){
                Double note = 2.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                b++;
            }else if(pkt == 7){
                Double note = 3.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                c++;
            }else if(pkt == 6 && pkt == 5){
                Double note = 4.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                d++;
            }else if(pkt == 3 && pkt == 4){
                Double note = 5.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                e++;
            }else if(pkt == 0 && pkt == 1 && pkt == 0){
                Double note = 6.0;
                Function.Ausgabe(Double.toString(note));
                gesamt += note;
                f++;
            }else{
                Function.Ausgabe("Falsche Punkte");
                anz--;
            }
            
            Double durch = gesamt / anz; // eigentlich Deff am Anfang :D     
            
            Function.Ausgabe("Durchschnitt" + Double.toString(durch));
            Function.Ausgabe("1 = "+Double.toString(a));
            Function.Ausgabe("2 = "+Double.toString(b));
            Function.Ausgabe("3 = "+Double.toString(c));
            Function.Ausgabe("4 = "+Double.toString(d));
            Function.Ausgabe("5 = "+Double.toString(e));
            Function.Ausgabe("6 = "+Double.toString(f));
            
            
            
        }
        
        
        
        
        
        
    }
    
}
