import java.util.Scanner;

public class atividade1 {

    public static double areacirculo (double raio) {
        double area;
        area = Math.PI * (raio * raio);
        return area;    
    }


     public static double volumedocone (double raiocone , double altura) {
        double Volume;

        double volume = (1.0 / 3.0) * Math.PI * (raiocone * raiocone)* altura;
        System.out.println("O volume do cone é: " + volume);

        return volume;

     }


    

    public static void main(String[] args) {
       
        int opcao=0;
        while(opcao !=3) {
           
            System.out.println("Digite a Opcao desejada:");
            System.out.println(" 1 - Caulculo da Area do Circulo");
            System.out.println(" 2 - Caulculo do Volume do come");
            System.out.println(" 3 - SAIR");
            Scanner resp = new Scanner(System.in);
            opcao = resp.nextInt();

            switch(opcao) {

                case 1:

                System.out.println("Digite Raio do circulo: ");
                int raio = resp.nextInt();

                double resultado = areacirculo(raio);
                System.out.println("Resultado");
                System.out.println(resultado);
                break;

                case 2:
                
                 System.out.print("Digite o raio da base do cone: ");
                 double raiocone = resp.nextDouble();
                 System.out.print("Digite a altura do cone: ");
                 double altura = resp.nextDouble();
                 
                 double resultado2 = volumedocone(raiocone,altura);
                 System.out.println("Resultado");
                  System.out.println(resultado2);


                break;

                case 3:

                break;

            

        }
    }
}



}