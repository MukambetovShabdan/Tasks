import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double sum = 0;
        double b = 0;
        double c;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            a = scan.nextDouble();
            if (a >= 0 && a <= 10) {
                sum += a;
            } else {
                System.out.println("nota invalida");
                i = i - 1;
            }
        }
        System.out.printf("media = %.2f%n", sum / 2);
        while (b != 2) {
            sum = 0;
            System.out.println("novo calculo (1-sim 2-nao)");
            for (int i = 1; i <= 1; i++) {
                b = scan.nextDouble();
                if (b == 1) {
                    for (int f = 1; f <= 2; f++) {
                        c = scan.nextDouble();
                        if (c >= 0 && c <= 10) {
                            sum += c;
                        } else {
                            System.out.println("nota invalida");
                            f = f - 1;
                        }
                    }
                    System.out.printf("media = %.2f%n", sum / 2);

                } else if (b == 2) {
                    break;
                } else {
                    i = i - 1;
                    System.out.println("novo calculo (1-sim 2-nao)");
                }
            }
        }
    }
}