
package namenaten;
import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 * @version 1.0
 * @author JSkopp
 */
public class Namenaten {
 
    // Abfrage
            public boolean vgl(boolean array1, char char1){
                    return Arrays.asList(array1).contains(char1);
    }
      
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
            //Variabeln
                final String[] X1= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                final String[] X2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                final char[] request = JOptionPane.showInputDialog("Bitte geben Sie ein Wort ein (A-Z/a-z): ").toCharArray();
                char[] user = new char[request.length];
                boolean test = true;
                int count = 0;
                int i = 0;
                int a = 0;
                
                // Auf den neuen Java 10 Block verzichte ich hier
                
                // Last die Spiele beginnen :) 
                for(i=0; i<user.length;i++){
                    user[i] = '*';
                }
                
                //erste Ausgabe
                    while(user != request)
                        for(i=0; i<user.length; i++){
                            System.out.print(user[i]);
                        }
                    
                    
                    
                    
                        
                
                    
    }
    
}

