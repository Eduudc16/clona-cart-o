import java.util.Scanner;

/**
 * app
 */
public class app {
public static void main(String[] args) { 

    Scanner captura = new Scanner(System.in);

    System.out.print("Digite algo");

    String texto = captura.nextLine();

    System.out.println(texto);

    captura.close();
   } 
} 