package datei;
import java.io.*;
import java.util.*;


/**
 * @author Barthyr
 */

public class Datei {

    
    public static void main(String[] args) throws IOException {
       Calendar cal = Calendar.getInstance();
       String datei = "temp/data.csv";
       Scanner sc = new Scanner(System.in);
       boolean dir = new File("temp").mkdir();
       Writer fw = new FileWriter (datei, true);
       
        
       //header
       fw.write("Jahr;Monat;Datum;Wert1;Wert2;Wert3;Wert4;Wert5;TimeStamp");
       fw.append("\r\n");
       //end head
       
       for(int c=0;c<3;c++){
           System.out.println("Jahr "+(c+1)+": ");
                fw.write(sc.next()+";"); 
           System.out.println("\nMonat "+(c+1)+": ");
                fw.write(sc.next()+";");
           System.out.println("\nTag "+(c+1)+": ");
                fw.write(sc.next()+";");
           
           for(int i=0;i<5;i++){
               System.out.println("Wert"+(i+1)+": ");
               fw.write(sc.next());
            }
       
       fw.write(cal.get(Calendar.DAY_OF_MONTH)+"."+cal.get(Calendar.MONTH)+"."+cal.get(Calendar.YEAR)+";");
       fw.append("\r\n");
       }
       fw.close();
    }
    
}
