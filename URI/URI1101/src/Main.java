import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d;
        int c = 0;
        if (a > 0 && b > 0) {
            if (a > b) {
                d = a + b;
                System.out.print(b);
                while (b != a - 1) {
                    b++;
                    c = c + b;
                    System.out.print(" " + b);

                }
                System.out.print(" " + a + " ");
                System.out.println("Sum=" + (c + d));
            }
            if (b > a) {
                d = b + a;
                System.out.print(a);
                while (a != b - 1) {
                    a++;
                    c = c + a;
                    System.out.print(" " + a);
                }
                System.out.print(" " + b + " ");
                System.out.println("Sum=" + (c + d));

            }
            if (a == b) {
                System.out.print(a + " " + b + " Sum=" + (a + b));
            }


        }
    }
}

