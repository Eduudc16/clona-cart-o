import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] vetor = new int[16];
        
       
        System.out.println("Digite 16 valores para preencher o vetor:");
        for (int i = 0; i < 16; i++) {
            vetor[i] = scanner.nextInt();
        }
        
      
        for (int i = 0; i < 8; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 8];
            vetor[i + 8] = temp;
        }
        
        
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scanner.close();
    }
}