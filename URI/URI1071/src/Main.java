import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        if (a >= b && b % 2 != 0) {
            for (int i = b + 2; i < a; i += 2) {
                c += i;

            }
            System.out.println(c);
        } else if (a >= b && b % 2 == 0) {
            for (int i = b + 1; i < a; i += 2) {
                c += i;

            }
            System.out.println(c);
        } else if (a <= b && a % 2 != 0) {
            for (int i = a + 2; i < b; i += 2) {
                c += i;

            }
            System.out.println(c);
        } else if (a <= b && b % 2 == 0) {
            for (int i = a + 1; i < b; i += 2) {
                c += i;
            }
            System.out.println(c);
        }
    }
}
