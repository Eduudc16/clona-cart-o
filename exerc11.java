import java.util.Scanner;

public class exerc11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Saindo do programa.");
                break;
            }

            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                continue;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
            }
        }

        scanner.close();
    }
}