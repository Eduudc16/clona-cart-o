import java.util.Scanner;

public class exerc16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] vetorOriginal = new int[10];
        
        
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }
        
        
        int[] vetorMultiplicado = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            vetorMultiplicado[i] = vetorOriginal[i] * 5;
        }
        
       
        System.out.println("Valores originais\tValores multiplicados por 5");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetorOriginal[i] + "\t\t\t" + vetorMultiplicado[i]);
        }
        
        scanner.close();
    }
}