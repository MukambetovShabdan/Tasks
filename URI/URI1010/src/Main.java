import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A1 = scan.nextInt(); int B1 = scan.nextInt(); double C1 = scan.nextDouble();
        int A2 = scan.nextInt(); int B2 = scan.nextInt(); double C2 = scan.nextDouble();
        double X = (B1 * C1) + (B2 * C2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", X);
    }
}
