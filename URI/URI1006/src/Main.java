import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double A = scan.nextDouble();
        Double B = scan.nextDouble();
        Double C = scan.nextDouble();
        Double A1 = A * 2;
        Double B1 = B * 3;
        Double C1 = C * 5;
        System.out.printf("MEDIA = %.1f%n", (A1 + B1 + C1) / (2 + 3 + 5));

    }
}
