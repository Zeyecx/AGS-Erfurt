
package noten;
import javax.swing.*;
import java.util.*;


/* @author BG15DV2 - JSKOPP */
public class Noten {

    public static void main(String[] args) {
        
        List<Double> percent = new ArrayList<Double>(); 
        List<Double> overview = new ArrayList<Double>(); /* overview about the students */ 
        List<Double> sub = new ArrayList<Double>(); /* {Schüler(0); max.Pkt(1); schnitt(2); sys(3)} */
        List<Double> noten = new ArrayList<Double>(); 
        boolean c = true; /* NICHT DIE BESTE LÖSUNG */
        double count = 0.0;
        
        percent.add(0.92);
        percent.add(0.82); 
        percent.add(0.62);
        percent.add(0.50);
        percent.add(0.30);
        percent.add(0.00);
       
        sub.add(Double.parseDouble(JOptionPane.showInputDialog("Anzahl der Schüler: ")));
        sub.add(Double.parseDouble(JOptionPane.showInputDialog("Maximalpunkte: ")));
        

        /* punkte / max >= note */
        
     for(int i = 0; i <= sub.get(0)-1; i++ ) 
     {
           noten.add(Double.parseDouble(JOptionPane.showInputDialog("erreichte Punkte von Schüler Nummer "+i+": "))); 
        
        /* Welche Note ?! */
        if((noten.get(i)/sub.get(0) >= percent.get(0))&&(c))
        {
           noten.set(i,1.0);
            c = false;
        }
                      
        if((noten.get(i)/sub.get(0) >= percent.get(1))&&(c))
        {
           noten.set(i,2.0);
            c = false; 
        }
        
        if((noten.get(i)/sub.get(0) >= percent.get(2))&&(c))  
        {
            noten.set(i,3.0);
            c = false; 
        }
        
        if((noten.get(i)/sub.get(0) >= percent.get(3))&&(c))
        {
           noten.set(i,4.0);
            c = false; 
        }
        
        if((noten.get(i)/sub.get(0) >= percent.get(4))&&(c))
        {
            noten.set(i,5.0);
            c = false; 
        }
        
        if((noten.get(i)/sub.get(0) >= percent.get(5))&&(c))
        {
         noten.set(i,6.0);
            c = false;             
        }
     
        c = true ;
        
     }
     
     for(int x = 0; x <= noten.size()-1; x++){ count = count + noten.get(x); if(x==noten.size()-1){sub.set(2,count/noten.size());};}
    

     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==1.0){count=count+1;}if(x==noten.size()-1){overview.set(0,count);}}
     
     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==2.0){count=count+1;}if(x==noten.size()-1){overview.set(1,count);}}
     
     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==3.0){count=count+1;}if(x==noten.size()-1){overview.set(2,count);}}
     
     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==4.0){count=count+1;}if(x==noten.size()-1){overview.set(3,count);}}
     
     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==5.0){count=count+1;}if(x==noten.size()-1){overview.set(4,count);}}
   
     count = 0;
     for(int x=0; x<=noten.size()-1; x++){if(noten.get(x)==6.0){count=count+1;}if(x==noten.size()-1){overview.set(5,count);}}
    
     System.out.println(overview);
     
    }
        
}
