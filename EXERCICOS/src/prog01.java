import java.util.Scanner;

public class prog01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


       //pede para digitar uma palavra varias vezes
         String texto;
         int voltas =  0; // soma mais 1 em voltas

         do {
             if(voltas >= 3){
               System.out.println("Digitar qualquer palavra: ");
             }
             texto = leitura.next();
             voltas++;
         }while (!texto.equals("banana"));
         System.out.print("Voce tentou "+voltas+ "vezes\n");
   }
 }







