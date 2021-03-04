
package primzahlen;
import java.util.*;

/** @author JSkopp */

public class Primzahlen {

    
       
       
   public static boolean isPrime(int p){
      boolean istPrim = true;
      if (p >= 2) {
      } else {
          return false;
      }
                      
      for (int i=2; i <= Math.sqrt(p); i++){
         if (p%i == 0){
             istPrim = false;
             break;
         } else {
         }
      }             
      return istPrim;
   }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        do{
        System.out.print("Bitte geben Sie die zu prüfende Zahl ein: ");
        int a = sc.nextInt();
        if( !isPrime(a)){
            System.out.println(a + "ist keine Primzahl");
        }else{
            System.out.println(a + " ist eine Primzahl");
        }
        
        System.out.print("Möchten Sie das Programm neu starten? (y/n) ");
        }while(sc.next().equals("y"));
    }
  
    }

