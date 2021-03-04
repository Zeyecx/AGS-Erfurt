/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung1;

/**
 *
 * @author bg15dv-rstertzing
 */
public class Vererbung1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Angestellter B =new Angestellter ();    
            
        B.setNummer(3);
        B.setName("Glocjk");
        B.setVorname("Hans");
        
        B.setGehalt(1500);
        B.setProvision(500);
        B.Verdienst();
        
        System.out.println("Nummer:"+B.getNummer()+"\n"+"Name:\n"+B.getName()+"\n"+"Vorname:\n"+B.getVorname()+"\n"+"Verdienst " +B.Verdienst());
       
        System.out.println("\n");
        Arbeiter A =new Arbeiter();
        
        A.setName("Himmi");
        A.setNummer(2);
        A.setVorname("Karl");
        A.setStunden(12);
        A.setLohn(18);
        A.Verdienst();
        
        
       
        System.out.println("Nummer des Mitarbeiters:"+A.getNummer()+" \n Name:"+A.getName()+"\n Vorname:"+A.getVorname());
        System.out.println("Anzahl der gearbeiteten Stunden "+A.getStunden()+"\n"+"Lohn pro Stunde:"+ A.getLohn());
        System.out.println("Verdienst:"+A.Verdienst());   
    
    }
    
}
