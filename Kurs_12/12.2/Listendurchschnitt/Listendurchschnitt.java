package listendurchschnitt;

import java.util.*;

/** 
 * @author jeskopp
 * @version 1.0
 */

public class Listendurchschnitt {


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viele Zahlen wollen Sie eingeben: ");
        Double[] div = new Double[sc.nextInt()];
        double summe = 0.0;
        
        for(int c=0; c<div.length;c++){  // no foreach !!!
            System.out.print("Bitte geben Sie die "+(c+1)+". Zahl ein: ");
            div[c] = sc.nextDouble(); //vll. wird das mal nen final ;) 
            summe += div[c];
        }
        summe = summe / div.length;
        
        System.out.print("\nElemente in Liste: "+div.length+"\n");
        System.out.print("Durchschnitt: "+summe+"\n");
    }
    
}
