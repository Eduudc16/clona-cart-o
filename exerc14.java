import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int[] vetor = new int[20];
        
       
        System.out.println("Digite 20 valores para preencher o vetor:");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        
        System.out.print("Digite o valor a ser buscado (X): ");
        int x = scanner.nextInt();
        
        
        int posicao = -1; 
        for (int i = 0; i < 20; i++) {
            if (vetor[i] == x) {
                posicao = i;
                break; 
            }
        }
        
      
        if (posicao != -1) {
            System.out.println("O valor " + x + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("O valor " + x + " não foi encontrado no vetor.");
        }
        
        scanner.close();
    }
}