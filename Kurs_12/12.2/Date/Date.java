package date;
import java.util.*;


/**
 * @author Barthyr
 */

public class Date {

  
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Datum c = new Datum();
        Scanner sc = new Scanner(System.in);
        
        
        // user input
        System.out.print("Bitte geben Sie den aktuellen Tag ein: ");
        c.set_day(sc.nextInt());
        System.out.println("");
        
        System.out.print("Bitte geben Sie den aktuellen Monat (int) ein: ");
        c.set_month(sc.nextInt());
        System.out.println(" ");
        
        System.out.print("Bitte geben Sie das aktuelle Jahr ein: ");
        c.set_year(sc.nextInt());
        System.out.println(" ");
        
        // System value
        
        if(c.check_date()){
            System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"."+cal.get(Calendar.MONTH)+"."+cal.get(Calendar.YEAR));
        }else{
            System.out.print("Irgendwo ist da was falsch !!!");
        }
                
    }
    
}
