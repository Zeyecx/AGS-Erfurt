/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flächen_raum;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author GB15SDV2-jskopp
 */
public class Flächen_Raum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /* Deklaration der Variabeln */
            int zimmer = 0; /* Anzahl der zimmer */
            double flaeche = 0; /* Fläche der zimmer */
            double flroom = 0; /* System Fläche*/
            String eingabe = ""; /* String Parser */
            
        /*Abfrage der zimmer*/
        eingabe=JOptionPane.showInputDialog("Anzahl der Zimmer:");
        zimmer=Integer.parseInt(eingabe); /* Nur ganze Zimmer möglich */
        
        /*Schleife*/
        for(int x=1; x<=zimmer; x++) /* Schleife */
        { 
            /*Abfrage der Fläche des Zimmers*/
                eingabe=JOptionPane.showInputDialog("Fläche von Zimmer "+x+" eingeben:");
                flroom=Double.parseDouble(eingabe);
            
            /* Ausgabe und Zusammenrechnen */
                System.out.println("Zimmer "+x+" = "+flroom+"m²");
                flaeche = flaeche + flroom; /*Addition*/
        }

        /* Gesamt Ausgabe */
            System.out.println("------------------------------");
            System.out.println("Gesamt: "+flaeche+"m²"); 
        
        
    }
    
}
