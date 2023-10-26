public class appp {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        calcularRaizes(a, b, c);
    }

    public static void calcularRaizes(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raiz única: " + raiz);
        } else {
            System.out.println("Não existem raízes reais.");
        }
    }
}

