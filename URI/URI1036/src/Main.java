import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        float D;
        D = B * B - 4 * A * C;
        double F = Math.abs(Math.sqrt(D));
        double R1 = (-B + F) / (2 * A);
        double R2 = (-B - F) / (2 * A);
        if (D <= 0) {
            System.out.println("Impossivel calcular");
        } else if (A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }


    }
}
