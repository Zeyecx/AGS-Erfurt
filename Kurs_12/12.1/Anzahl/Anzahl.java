
    package anzahl;

    /**
     * @version 1.2
     * @author JSkopp
     */
    public class Anzahl {



        public static void main(String[] args) {
            // legt die Zähl fest
             int c = 0;    
                
            // legt das Array fest
                int[] number = new int[10000];

            // legt das Zähl-Array fest
                int[] count = new int[10];

            // lädt in das Array die Zufallszahlen
                for(c=0; c<number.length; c++){number[c] =(int)(Math.random() * 10)  ;} 
                


            // belegt das array mit jeweils einer 0
                for(c=0; c<count.length; c++){
                    count[c] = 0; 
                }

            //  legt die Häufigkeit für ein Array fest
                for(c=0; c<count.length; c++){
                    for(int d=0; d<number.length; d++){
                       count[number[d]] = count[c]+1; 
                    } 
                }

                
             // Ausgabe aller Werte in einer Liste
            for(c=0;c<number.length;c++){
                System.out.print(number[c]+";");
                }
        
            // Ausgabe der Häufigkeiten
           for(c=0;c<count.length;c++){
                System.out.print(" \n Die Zahl "+c+" tritt "+count[c]+" oft auf.");
                }
        
            
        }

     }
    
