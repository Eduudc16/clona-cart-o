import java.util.Scanner;

public class exerc8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado (entre 1 e 20):");
        
        int tamanholado = entrada.nextInt();

        if (tamanholado < 1 || tamanholado > 20) {
            System.out.println("Tamanho fora do intervalo permitido.");
        } else {
           
            for (int i = 0; i < tamanholado; i++) {
                for (int j = 0; j < tamanholado; j++) {
                    System.out.print("*");
                }
                System.out.println();

                entrada.close();


    }
    
               }
    }
}
