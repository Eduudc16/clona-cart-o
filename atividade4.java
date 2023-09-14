import java.util.Scanner;

public class atividade4 {
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);

        int valor = 1; 
        int maior = 0;
        int menor = 0;

        while (valor != 0){

            System.out.println("Digite o valor");
              
            valor = entrada.nextInt();

            if (maior < valor){
                maior = valor;

            }else if (menor > valor){
                      menor = valor;
            } 

            System.out.println("Maior numero foi:");   
            System.out.println(maior);

            System.out.println("");
            
            System.out.println("Menor numero foi:");         
            System.out.println(menor);
    
            
        }

    }
}
