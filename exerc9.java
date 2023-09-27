import java.util.Scanner;

public class exerc9 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do triângulo: ");

        int tamanho = entrada.nextInt();

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        
    }
    
}
