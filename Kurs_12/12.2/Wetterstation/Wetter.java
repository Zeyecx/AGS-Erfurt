/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wetterstation;


import java.io.*;
import javax.swing.*;


/**
 *
 * @author bg15dv-jvockerodt und seine Schlümpfe
 */

public class Wetter {
private String eingabe;
private double temp;
private double ns;
double[][] Temp = new double[8][4];
double[][] NS = new double[8][4];

public void eingabe (){
    

            Object[] options = {"Temperatur", "Niederschlag"};

int selected = JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
null, options, options[0]);  

if(selected == 0){
      for(int i=0;i<=6;i++){
       for (int x=0; x<=2; x++){
          Temp[i][x] = Double.parseDouble(JOptionPane.showInputDialog("Temperatur eingeben"));
       }}}
if(selected == 1){
       {
       for(int n=0;n<=6;n++){
       for (int s=0; s<=2; s++){
          NS[n][s] = Double.parseDouble(JOptionPane.showInputDialog("Niederschlagsmenge eingeben"));
            }   
        }
    }

}
}

public void setTemp() {
      
        
                    Object[] options = {"Temperatur", "Niederschlag"};
        

int selected = JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
null, options, options[0]);
        

        if (selected == 0){
        int i = Integer.parseInt(JOptionPane.showInputDialog("Tag"));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Messzeit"));
        
        Temp[i-1][x-1] = Double.parseDouble(JOptionPane.showInputDialog("Temperatur eingeben"));
        }
        if (selected == 1){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tag"));
        int s = Integer.parseInt(JOptionPane.showInputDialog("Messzeit"));
        
        NS[n-1][s-1] = Double.parseDouble(JOptionPane.showInputDialog("Niederschlagsmenge eingeben"));
        }
    }
    
public void Ausgabe(){

Object[] options = {"Temperatur", "Niederschlag"};
        

int selected = JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
null, options, options[0]);
        

        if (selected == 0){

   for(int i=0;i<=6;i++){
       for (int x=0; x<=2; x++){
      
       System.out.println("Tag "+(i+1)+"  Messzeit: "+(x+1)+" = "+Temp[i][x]+"°C");    
       }
   } 
   System.out.println("Durchschnittstemp: "+Math.round(durchschnitt(Temp))+"°C");
   System.out.println("Maximaletemperatur: "+maxi(Temp)+"°C");
   System.out.println("Minimaletemperatur: "+mini(Temp)+"°C");
   
        }
        if (selected == 1){

   for(int n=0;n<=6;n++){
       for (int s=0; s<=2; s++){
      
       System.out.println("Tag "+(n+1)+"  Messzeit: "+(s+1)+" = "+NS[n][s]+"ml");
       }
   }
    System.out.println("Durchschnittsniederschlag: "+durchschnitt(NS)+"ml");
    System.out.println("Maximalerniederschlag: "+maxi(NS)+"ml");
    System.out.println("Minimalerniederschlag: "+mini(NS)+"ml");
   }
   

}


public void schreiben() throws IOException{
  Object[] options = {"Temperatur", "Niederschlag"};
  
int selected = JOptionPane.showOptionDialog(null,"Treffen Sie eine Auswahl","Alternativen",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
null, options, options[0]);

    switch (selected) {
        case 0:
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ausgabe_Temp.txt"))) {
                for(int i=0;i<=6;i++){
                    for (int x=0; x<=2; x++){
                        bw.write("Tag "+(i+1)+"  Messzeit: "+(x+1)+" = "+Temp[i][x]+"°C");
                        bw.append("\r\n");
                    }
                }
                bw.write("Durchschnittstemp: "+durchschnitt(Temp)+"°C");
                bw.write("Maximaletemperatur: "+maxi(Temp)+"°C");
                bw.write("Minimaletemperatur: "+mini(Temp)+"°C");
                bw.close();
            }catch(Exception e){System.out.println("Fehler: "+e);}
            break;
        case 1:
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ausgabe_Nieders.txt"))) {
                for(int i=0;i<=6;i++){
                    for (int x=0; x<=2; x++){
                        bw.write("Tag "+(i+1)+"  Messzeit: "+(x+1)+" = "+NS[i][x]+"°C");
                        bw.append("\r\n");
                    }
                }
                bw.write("Durchschnittsniederschlag: "+durchschnitt(NS)+"°C");
                bw.write("Maximalerniederschlag: "+maxi(NS)+"°C");
                bw.write("Minimalerniederschlag: "+mini(NS)+"°C");
                bw.close();
            }catch(Exception e){System.out.println("Fehler: "+e);}
            break;
        default:
            System.exit(0);
    }
}

public double durchschnitt(double[][] list){
    double durch = 0.0;
    for(int i=0;i<=6;i++){
       for (int x=0; x<=2; x++){
           durch = durch + list[i][x];
       }
    }
    durch = durch / 21; // Anzahl der Elemente der Liste. 
    return durch;
}

public static double maxi(double[][] numbers) {
        double maxValue = numbers[0][0];
    for (double[] number : numbers) { // foreach Schleife. 
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxValue) {
                maxValue = number[i];
            }
        }
    }
        return maxValue;
    }

public static double mini(double[][] numbers) {
        double minValue = 99999 ; // numbers[0][0]
    for (double[] number : numbers) { // foreach Schleife. For für Idioten
        for (int i = 0; i < number.length; i++) {
            if (number[i] >= minValue || number[i] == 0) {
            } else { 
                minValue = number[i];
            }
        }
    }
        return minValue ;
    }

}
