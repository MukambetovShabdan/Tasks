import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double div = 0;
        while (true) {
            int a = scan.nextInt();
            if (a == 0) {
                break;
            }
            if (a < 0 || a > 5) {
                System.out.printf("Grade %d is incorrect%n", a);
                a = 0;
                div -= 1;
            }
            sum += a;
            div += 1;
        }
        if (sum == 0) {
            System.out.println("Nothing to calculate");
        } else {
            double res = sum / div;
            System.out.printf("The arithmetic mean is %.1f%n", res);
        }
    }
}
