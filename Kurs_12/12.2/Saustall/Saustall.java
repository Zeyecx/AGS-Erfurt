
package saustall;
import java.util.*;

/**
 * @author Barthyr
 */

public class Saustall {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben sie das Gewicht des Tieres an: ");
        double gewicht = sc.nextDouble();
        System.out.print("Bitte geben Sie die normale Futtermenge ein: ");
        double anz = sc.nextDouble();
        
        Schwein s = new Schwein(gewicht, anz);
        int a = 0;
        
        do{
            System.out.println("1: Ausgabe Futter\t2: Füttern\t3: Schlachten?!\t4: Wiegen\t5: Programm beenden");
            a = sc.nextInt();
            switch(a){
                case 1:
                    s.get_futter();
                    break;
                case 2:
                    s.fuettern();
                    break;
                case 3:
                    if(s.schlachten()){
                        System.out.println("Das Schwein ist nun verstorben.");
                        s.kill();
                    }else{
                        System.out.println("Das Schwein ist noch zu leicht.");
                    }
                    break;
                case 4:  
                    System.out.println("Ihr Schwein wiegt "+s.wiegen()+"kg");
                    break;
                case 5:
                    System.out.println("");
                    
                    
                    
            }
            
            
            
            
            
        }while(true);
        
        
        
    }
    
}
