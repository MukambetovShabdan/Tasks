import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double A = scan.nextDouble();
        Double B = scan.nextDouble();
        Double C = scan.nextDouble();
        Double pi = 3.14159;
        Double X = 1 / 2.0 * A * C;
        Double R = C * C * pi;
        Double T = (A + B) / 2 * C;
        Double S = B * B;
        Double P = A * B;
        System.out.printf("TRIANGULO: %.3f%n", X);
        System.out.printf("CIRCULO: %.3f%n", R);
        System.out.printf("TRAPEZIO: %.3f%n", T);
        System.out.printf("QUADRADO: %.3f%n", S);
        System.out.printf("RETANGULO: %.3f%n", P);
    }
}
