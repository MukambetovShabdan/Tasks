import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) {
            double Area = (a + b) / 2 * c;
            System.out.printf("Area = %.1f%n", Area);
        } else {
            System.out.printf("Perimetro = %.1f%n", (a + b + c));
        }
    }
}
