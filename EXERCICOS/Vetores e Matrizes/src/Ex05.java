

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] limites = {0, 55, 65, 75, 85, 100};

        String[] categorias = {
                "pena",
                "leve",
                "medio",
                "meio-pesado",
                "pesado",
                "super-pesado"
        };

        System.out.print("Digite seu peso em kg (ou 0 para sair): ");
        int peso = entrada.nextInt();

        while (peso != 0) {

            boolean encontrou = false;

            for (int i = limites.length - 1; i >= 0; i--) {
                if (peso >= limites[i]) {
                    System.out.println("Categoria: " + categorias[i]);
                    encontrou = true;
                    break;
                }
            }

            if (!encontrou || peso < 0) {
                System.out.println("Peso invalido!");
            }

            System.out.print("\nDigite outro peso em kg (ou 0 para sair): ");
            peso = entrada.nextInt();
        }

        System.out.println("Programa encerrado!");

        entrada.close();
    }
}