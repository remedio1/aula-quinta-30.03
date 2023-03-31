
package quinta.feira.pkg30.pkg03;

import java.util.Scanner;


public class exercicio3 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int contador = 2;
        String login;
        String senha;

            
           
            
            while (contador >= 0){
               
            System.out.println("digite seu usuario");
            login = tc.next().toUpperCase();
            System.out.println("digite sua senha");
            senha = tc.next();  
                
 
            if (login.equalsIgnoreCase ("xandao") && senha.equals("12345")){
           
                System.out.println("Login efetuado!");         
            break;
            }else {
              
                System.out.println("usuario e senha errados");
             
               System.out.println("Você tem " + contador + " tentativas restantes");
               contador --;
                    }
            if ( contador < 0){
            System.out.println("você foi bloqueado");
            }
       
            }
                  
    }   
}
