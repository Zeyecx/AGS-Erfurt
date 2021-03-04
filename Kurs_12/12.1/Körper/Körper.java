
package körper;
import java.util.*;

/**
 * @version 1.0
 * @author JSkopp
 */
public class Körper {
    double pi = 3.14;
   
    
    
    public static int auswahl(){
        Scanner sc = new Scanner(System.in);
        System.out.print("~~~~");
        System.out.print("Bitte wählen Sie: \n\t Programm beenden \n\t Würfel 1\n\t Pyramide 2 \n\t Quader 3");
        return sc.nextInt();
    }
    
    public static double Würfel(double a){
        return a*a*a;
    }
    
    public static double Pyramide(double Ag, double h){
        return 0.33*Ag*h;
    }
    
    
    public static double Quader(Double a, double b, double c){
        return a*b*c;
    }
    
    
    public static void reload(){
        
    }
    
    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
        switch (auswahl()){
            case 1:
                System.out.print("Bitte geben Sie a ein: ");
                double a = sc.nextDouble();
                System.out.print("\nV="+Würfel(a)+"m³");
                break;
            case 2:
                System.out.print("Bitte geben Sie Ag ein: ");
                double Ag = sc.nextDouble();
                System.out.print("\n Bitte geben Sie die Höhe ein: ");
                double h = sc.nextDouble();
                System.out.print("\nV="+Pyramide(Ag,h));
                break;
            case 3:
                System.out.print("Bitte geben Sie a ein: ");
                double x = sc.nextDouble();
                System.out.print("\n Bitte geben Sie b ein: ");
                double y = sc.nextDouble();
                System.out.print("\n Bitte geben Sie c ein: ");
                double z = sc.nextDouble();
                System.out.print("\nV="+Quader(x,y,z)+"m³");
            case 0:
                System.exit(0);
        }
    }
    
  }

}
