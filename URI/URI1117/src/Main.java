import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float a;
        float d = 0;
        while (i < 2) {
            a = scan.nextFloat();
            if (a >= 0 && a <= 10) {
                d = d + a;
                i++;
            } else {
                System.out.println("nota invalida");
            }
        }
        double f = d / 2;
        System.out.printf("media = %.2f%n", f);
    }

}
