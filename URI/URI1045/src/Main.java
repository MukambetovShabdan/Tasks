import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double A = 0.0;
        double B = 0.0;
        double C = 0.0;
        if (a >= b && a >= c) {
            A = a;
            B = b;
            C = c;
        } else if (b >= a && b >= c) {
            A = b;
            B = a;
            C = c;
        } else if (c >= a && c >= b) {
            A = c;
            B = b;
            C = a;
        }
        A = Math.abs(A);
        B = Math.abs(B);
        C = Math.abs(C);
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && B != C) || (A != B && A == C) || B == C && A != C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
