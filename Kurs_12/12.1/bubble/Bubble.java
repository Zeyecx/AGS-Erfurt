/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

/**
 *
 * @author JSkopp
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] zahlenGesamt = {1 ,4,2,3,4,5,345,234,26,234};
        
        int temp;
		for(int i=1; i<zahlenGesamt.length; i++) {
			for(int j=0; j<zahlenGesamt.length-i; j++) {
				if(zahlenGesamt[j]>zahlenGesamt[j+1]) {
					temp=zahlenGesamt[j];
					zahlenGesamt[j]=zahlenGesamt[j+1];
					zahlenGesamt[j+1]=temp;
				}
				
			}
		}
                
                
for (int a = 0; a<zahlenGesamt.length; a++){
    System.out.print(zahlenGesamt[a]+",");
}
                
                
                
                
        
        
    }
    
}
