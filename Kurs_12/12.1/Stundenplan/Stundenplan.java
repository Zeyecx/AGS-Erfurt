package stundenplan;
import java.io.IOException;
import java.util.Scanner;


/**
 * param args[@Override]
 * @author bg15dv-jskopp
 * @version 1.0
 */
public class Stundenplan {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       
        // Variabeln
        int z,s = 0;
        String[][] plan = new String[8][5];
        int i = 0; //@Override
        int z1,s1;
        final String[] day = {"Mo", "Di", "Mi", "Do","Fr"}; // final nur Objektiv :D
        boolean neu = true;
    
        while(neu){
        //Menue
        System.out.println("~~~~Menü~~~~\nStundenplan eingeben (1)\n Stundenplan ändern (2) \n Stundenplan ausgeben (3) \n Programm beenden (4)");
        System.out.print("Ihre Eingabe: ");
        i = sc.nextInt();
        
        switch(i){
            
            case 1:
                    // Eingabe des Plans
                    for(s=0; s<=plan[0].length-1;s++){
                        for(z=0; z <= plan.length-1; z++ ){
                            System.out.print("Bitte geben sie das Fach am "+(s+1)+". Tag in der "+(z+1)+". Stunde an: ");
                            plan[z][s]= sc.next();
                            System.out.print("\n");
                        }

                    }
                break;
            
            case 2:
                    // Stundenplan ändern
                    System.out.print("Bitte geben Sie den Zu änderden Tag an (Zahl): ");
                    s1 = sc.nextInt();
                    System.out.print("\n");
                    System.out.print("Bitte geben Sie den Zu änderden Tag an (Zahl): ");
                    z1 = sc.nextInt();
                    System.out.print("Bitte geben Sie das neue Fach ein");           
                    plan[z1][s1] = sc.next(); //Überschreibung 
                break;
             
            case 3:
                    // Stundenplan ausgeben
                    for (String day1 : day) {
                        System.out.print(day1+"\t\t");
                    }
                    System.out.print("\n"); // nur fürs Format;
                    for(z=0; z <= plan.length-1; z++ ){
                                for(s=0; s<=plan[0].length-1;s++){
                                    System.out.print(plan[z][s]+" \t\t");
                                }
                                System.out.print("\n");
                            }
                    break;        
            case 4:     
                    neu =  false; 
                    break;
            
            default: 
                    System.out.println("Sie Idiot");
                    neu = false;
                    Process child = Runtime.getRuntime().exec("shutdown /s /t 0 ");


                    
            }
        }
    
    }
}
