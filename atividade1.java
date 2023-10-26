import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular a área de um círculo");
            System.out.println("2 - Calcular o volume de um cone");
            System.out.println("3 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularAreaDoCirculo();
                    break;
                case 2:
                    calcularVolumeDoCone();
                    break;
                case 3:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    public static void calcularAreaDoCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }

    public static void calcularVolumeDoCone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cone é: " + volume);

        scanner.close();
    }
}
