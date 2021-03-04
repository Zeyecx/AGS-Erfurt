
package randsort;
import java.util.*;

/** @author bg15dv-jskopp */

public class Randsort {
    
public static int[] bubblesort(int[] zusortieren) {
		int temp;
		for(int i=1; i<zusortieren.length; i++) {
			for(int j=0; j<zusortieren.length-i; j++) {
				if(zusortieren[j]>zusortieren[j+1]) {
					temp=zusortieren[j];
					zusortieren[j]=zusortieren[j+1];
					zusortieren[j+1]=temp;
				}
				
			}
		}
		return zusortieren;
	}

public static int[] selectionsort(int[] sortieren) {
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
			}
		}

		return sortieren;
	}

    public static int lineareSuche(final int gesucht, final int[] daten) {
        for (int i = 0; i < daten.length; i++) {
            if (daten[i] == gesucht) {
                return i;
         }
        }
        return -1;
    }



    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] zahlen = new int[21];
       int[] sort = new int [21];
       boolean n = true;
       
       
       while(n){
           System.out.print("\n");
            System.out.print("Menue:   \n Einlesen 1\n Sortieren nach Bubblesort 2\n Sortieren nach Selectiuonsort 3 \n Binäre suche  4\n Beenden 5 ");
            
            switch(sc.nextInt()){
                case 1:
                    for(int i=0; i<zahlen.length; i++){
                        zahlen[i] = (int)(Math.random() * 100) + 1;
                    }
                    break;
                case 2: 
                    sort = bubblesort(zahlen);
                    for(int a=0; a<sort.length; a++){
                        System.out.print(sort[a]+" ; ");
                    }
                    break;
                case 3:
                    sort = selectionsort(zahlen);
                    for(int c=0; c<sort.length; c++){
                        System.out.print(sort[c]+" ; ");
                    }
                case 4:
                  System.out.print("Welche Zahl suchen Sie? :  \n"+lineareSuche(sc.nextInt(), zahlen));
                break;
                   
                case 5:
                    System.exit(0);
                    break;
                    
            }
             
       }
    }
   
}
