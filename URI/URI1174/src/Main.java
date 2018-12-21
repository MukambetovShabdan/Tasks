import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[100];
        for (int i = 0; i < 100; i++) {
            array[i] = scan.nextDouble();
            if (array[i] <= 10) {
                System.out.println("A[" + i + "] = " + array[i]);

            }
        }
    }
}