
package dual;

import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author JSkopp
 */
public class Dual {
    public static void Ausgabe(String text){
             JOptionPane.showMessageDialog(null, text);
             System.out.print(text+"\n");

    } 
                public static Integer eingabe (String text){
                    return Integer.parseInt(JOptionPane.showInputDialog(text));
                }
    public static int [] b = new int[8];
    public static Integer[] figure = new Integer[0];
    public static String  i = ""; // ini Var :D
    
    public static Integer bin = Dual.eingabe("Ihre Zahl: ");
            
   /*
    public static void Programm (){
         Dual.Ausgabe(Dual.dualrdy(bin));
    } 
    public static String umkehren( String str )
    {
    String umgekehrt = new String();

    for ( int j = str.length()-1; j >= 0; j-- )
      umgekehrt += str.charAt(j);

    return umgekehrt;
  }
    // ars[].var = null;
    
    */
     
     
    public static int[] dualrdy (Integer bin){
        for(int i = 7; bin>0; --i)
           {
               if(bin % 2 == 0 ){
                 Dual.b[i] = 0;
                 
               }    
                    
               else{
                 Dual.b[i] = 1 ; 
               }
           
           bin/=2;
           }
        
        return b;
    }
    
    public static void main(String[] args) {
        for(int n:Dual.dualrdy(bin)){
            System.out.println(n);
        }
      }

}
