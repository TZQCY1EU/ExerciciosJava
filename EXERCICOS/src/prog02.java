import java.util.Scanner;
public class prog02{


        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            double altura;
            double soma = 0;
            int contador = 0;

            String resposta;
            do {
                System.out.print("Digite a altura: ");
                altura = entrada.nextDouble();

                soma += altura;
                contador++;

                System.out.print("Tem mais alturas para informar? (s/n) ");
                resposta = entrada.next();

            } while(resposta.equalsIgnoreCase("s"));

            double media = soma / contador;

            System.out.println("Média das alturas: " + media);
            entrada.close();
        }

             }









