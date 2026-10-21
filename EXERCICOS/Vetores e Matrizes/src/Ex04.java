

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] cores = {
                "vermelho", "laranja", "amarelo",
                "verde", "azul", "anil", "violeta"
        };

        int acertos = 0;
        int erros = 0;

        while (acertos < 7) {

            System.out.print("Digite uma cor do arco-íris (ou 'sair' para desistir): ");
            String cor = entrada.nextLine().trim().toLowerCase();

            if (cor.equals("sair")) {
                break;
            }

            boolean encontrou = false;

            for (int i = 0; i < cores.length; i++) {
                if (cor.equals(cores[i])) {
                    encontrou = true;
                    break;
                }
            }

            if (encontrou) {
                acertos++;
                System.out.println("Acertou! A cor está no arco-íris.");
            } else {
                erros++;
                System.out.println("Errou! Essa cor não está na lista.");
            }

            System.out.println("Acertos: " + acertos);
            System.out.println("Erros: " + erros);
            System.out.println();
        }

        System.out.println("Fim do jogo!");
        System.out.println("Total de acertos: " + acertos);
        System.out.println("Total de erros: " + erros);

        entrada.close();
    }
}