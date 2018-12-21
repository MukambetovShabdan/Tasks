import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("N: ");
        int n = scan.nextInt();
        int[] x = new int[12];

        for (int i = 1; i <= n; i++) {
            int b = rnd.nextInt(6);
            int c = rnd.nextInt(6);
            for (int j = 0; j < 11; j++) {
                if (b + c == j) {
                    x[j] += 1;
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d: %d%n", i + 2, x[i]);
        }
    }
}