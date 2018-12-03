import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        int b = 0, c = 0, d = 0, f = 0;
        for (int i = 1; i <= 5; i++) {
            a = scan.nextInt();
            if (a % 2 == 0) {
                b += 1;
            }
            if (a % 2 != 0) {
                c += 1;
            }
            if (a > 0) {
                d += 1;
            }
            if (a < 0) {
                f += 1;
            }
        }
        System.out.println(b + " valor(es) par(es)");
        System.out.println(c + " valor(es) impar(es)");
        System.out.println(d + " valor(es) positivo(s)");
        System.out.println(f + " valor(es) negativo(s)");
    }
}