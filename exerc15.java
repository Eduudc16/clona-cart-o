import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        int tamanho = 40;
        
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int contadorPares = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("O vetor possui " + contadorPares + " valores pares.");
        
        scanner.close();
    }
}