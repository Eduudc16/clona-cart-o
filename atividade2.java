import java.util.Scanner;

public class atividade2 {
    
    public static void main(String[] args) {
   
       
        Scanner entrada = new Scanner(System.in);

        int valor;

       valor = entrada.nextInt();

       while( valor != 0 && valor != 1) {

        System.out.println("DIGITE UM VALOR: ");
        valor = entrada.nextInt();
       }

       System.out.print("Digitado: " + valor);


       entrada.close();

    }

}
