
package getränkeautomat;
import java.util.Scanner;
public class Getränkeautomat {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double wasser = 0.00, softdrink = 0.00, energydrink = 0.0, bier = 0.00;
    double getraenk = 0.0, anz= 0.0, kunde = 0.0, preis = 0.0, anzkunde = 0.0;
    double neu = 0.0, ges=0.0;
        
        while(neu == 0.0){
    System.out.println("Welches Getränk ?");
    getraenk= sc.nextDouble();
    System.out.println("Wie viel wollen Sie nehmen?");
    anz = sc.nextDouble();
    
    if (getraenk == 1){
        preis = 1.50;
        wasser=wasser + anz;
    }else if(getraenk == 2){
        preis = 2.0;
        softdrink = softdrink+ anz;
    }else if (getraenk == 3){
        preis = 2.20;
        energydrink = energydrink + anz;
    }else if (getraenk == 4){
        preis = 2.50;
        bier = bier + anz;
    }else {
        System.out.println("Fehler!");
    }
    
    anzkunde++;
    
    System.out.println("Glückwunsch, Sie sind der "+ anzkunde+"te Kunde");
    
    
    kunde = kunde + anz * preis;
    System.out.println("Kosten: "+ kunde+"€");
    System.out.println("Anzahl des Wassers"+ wasser);
    System.out.println("Anzahl des Softdrink"+ softdrink);
    System.out.println("Anzahl des Energydrinkes"+ energydrink);
    System.out.println("Anzahl des Biers"+ bier);
    
    ges = ges + preis;
    
    
    
    
    
    
    System.out.println("Wollen Sie das Programm Wiederholen? Dann drücken Sie 0!");
        
        double zahl=sc.nextDouble();
        
        if (zahl==0){
            neu = 0.0; 
        }
        else {
            neu = 1;
        }
    
  
    }
        System.out.println("Ihre Gesamtsumme beträgt"+ ges+"€");
        
    
    }}