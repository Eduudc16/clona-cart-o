import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int indice = 0;

        System.out.println("Digite os números ímpares para preencher o vetor:");

        while (indice < 10) {
            System.out.print("Digite um número ímpar: ");
            int numero = scanner.nextInt();

            if (numero % 2 != 0) {
                vetor[indice] = numero;
                indice++;
            } else {
                System.out.println("Esse número não é ímpar. Tente novamente.");
            }
        }

        scanner.close();

        System.out.print("Vetor de números ímpares: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}