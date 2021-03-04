
package fortbildungsprämien;

 /** @author JSkopp */
public class Fortbildungsprämien {

   
    public static void main(String[] args) {
     
        Function function = new Function();
        
        Double Dauer = function.eingabe("Wie lange arbeiten Sie schon hier? : ");
        Double Fort = function.eingabe("Fortbildungen: ");
        boolean test = true;
        Double Zuschlag = 0.0;
        
        
        
        /* IF - ELSE BLOCK */
        
        while(test){
        
        if(Dauer >= 0 && Dauer <= 3 && test){
            Zuschlag = 0.0; /* Hätte man sich auch schenken können */
        }
        if (Dauer >= 4 && Dauer <= 7 && test){
            if (Fort >= 1){
                Zuschlag = 12.50;
                test = false;
            }
        }
        if (Dauer >= 8 && Dauer <= 11 && test){
            if (Fort >= 2){
                Zuschlag = 17.50;
                test = false;
            }
        }
        if (Dauer >= 12 && Dauer <= 15 && test){
            if (Fort >= 3){
                Zuschlag = 21.00;
                test = false;
            }
        }
        if (Dauer >= 15 && test){
            if (Fort >= 4){
                Zuschlag = 23.50;
                test = false;
            }
        }
        if(test){function.Ausgabe("Error");} //Fehler suche
         
        function.Ausgabe("Ihr Zuschlag beträgt: " + function.String(Zuschlag) + " €");
 
       if(!function.NeuStart()){
           test = false; 
       }
        
        
        }
    }
}
        
 
