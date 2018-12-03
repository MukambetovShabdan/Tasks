import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        int b = 0;
        double c = 0;
        for (int i = 1; i <= 6 ;i++) {
            a = scan.nextDouble();
            if (a > 0) {
                b += 1;
                c += a;
            }
        }
        System.out.println(b + " valores positivos");
        System.out.printf("%.1f",c / b);

    }
}