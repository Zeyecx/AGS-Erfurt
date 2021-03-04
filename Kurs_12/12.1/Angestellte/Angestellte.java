
package angestellte;

import java.util.*;

/**
 * @version 1.0 
 * @author bg15dv-jskopp
 */

public class Angestellte {
    
    /**
     * @param gesucht str
     * @param daten List
     * @return int i and if invert -1 
     */

      public static int lineareSuche(final String gesucht, final ArrayList<String> daten) {
        for (int i = 0; daten.size() >= i; i++) {
         if (daten.get(i) == null ? gesucht == null : daten.get(i).equals(gesucht)) {
             return i;
         }
        }
        return -1;
    }
    
   
/** @see main */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         boolean n = true;
         ArrayList<String>name = new ArrayList( );  
         boolean neu = true;
         
         while(neu){
         System.out.println("1. Eingabe \n2. Ausgabe \n3. Suche \n4. Ende");
         switch(sc.nextInt()){
            case 1:
                while(n){
                   if(name.size()>10){
                   } else {
                       System.out.print("Möchten Sie noch weitere hinzufügemn (y/n)");
                       if(!sc.next().equals("y")){
                           n = false;
                       }else{
                           System.out.print("Bitte geben Sie den Namen an: ");
                           name.add(sc.next());
                       }
             }
                }
            break;
            
            case 2:
                name.stream().forEach((name1) -> {
                    System.out.print("name: " + name1);
                 });
                break;
            case 3:                
                System.out.print("Wen suchen Sie? :  \n"+lineareSuche(sc.next(), name));
                break;
            case 4:
                System.out.print("\n Möchten Sie das Programm beenden? (y/n): ");
                neu = !sc.next().equals("y");
                break;
        }
    }
         
 }
    
}   
