import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
     
        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;

     Scanner entrada = new Scanner(System.in);

     System.out.println("informe o primeiro número");
     valor1 = entrada.nextDouble();

     System.out.println("informe o segundo número");
     valor2 = entrada.nextDouble();

     System.out.println("informe o terceiro número");
     valor3 = entrada.nextDouble();

     entrada.close();

     if(valor1 > valor2 && valor1 > valor3){

        System.out.println("maior valor: " + valor1);

     } else if (valor2 > valor1 && valor2 > valor3){

        System.out.println("maior valor: " + valor2);

        } else if (valor3 > valor2 && valor3 > valor1){

        System.out.println("maior valor: " + valor3);
        } 

    

        
    }
}