
package markt;

/**
 * @version 1.0
 * @author JSkopp
 */
public class Interface {
    
    public static void Bestellung(){
        do{
            var.client[0] = function.eingabe("Bitte geben Sie die Produkt-ID ein: \n");   
          }while(var.client[0] <= 1 && var.client[0] >= 10);
        function.log("enter var.client[0] in Interface.java[Interface.Bestekkung()] --> "+Integer.toString(var.client[0]));
           
        
            var.client[1] = function.eingabe("Wie viele Objekte wollen Sie kaufen?: \n");
            
            if(function.test()){
                function.Ausgabe("Es sind noch "+ var.anz+" Objekte mit der ID "+var.client[0]);
                var.Ware[var.client[1]]= var.anz;
            }else {
                function.Ausgabe("Pech gehabt. Für Sie ist nichts da");
             }
        }

    public static void Eingabe(){
             for(int i = 0; i <= var.Ware.length-1; i++){
                var.cheat = i + 1; //war mir zu blöd :D
                var.Ware[i] = function.eingabe("Anzahl von Artikel: "+var.cheat+"\n");
            }
    }
    public static void Aendern(){
        do{
            var.change[0] = function.eingabe("Bitte geben Sie die Produkt-ID ein: \n");   
          }while(var.change[0] <= 1 && var.change[0] >= 10);
        var.change[1] = function.eingabe("Wie viele sind jetzt da ? ");
        var.Ware[var.change[0]] = var.change[1];
    }
    public static void Ende(){
        function.Ausgabe("Sie haben das Programm soebe beendet");
        
    }
    
    
    public static void error(){
        function.Ausgabe("Blöd gelaufen");
        
    }
    
}
