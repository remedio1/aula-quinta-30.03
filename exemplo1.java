
package quinta.feira.pkg30.pkg03;

import java.util.Scanner;


public class exemplo1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
          
        int contador = 0;
                  
         while ( contador < 5) {        
             System.out.println("contador = " 
                     + contador);
             contador ++;
         
         
         }
        System.out.println("contador fora do while = " + contador);
        
        
        
        tc.close();
    }
}
