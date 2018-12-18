import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        while (true) {
            int a = scan.nextInt();
            if (a == 0) {
                break;
            }
            if (a % 2 == 0) {
                for (int i = 1; i <= 5; i++) {
                    res += a;
                    a += 2;
                }
            } else if (a % 2 != 0) {
                a += 1;
                for (int i = 1; i <= 5; i++) {
                    res += a;
                    a += 2;
                }

            }
            System.out.println(res);
            res = 0;
        }
    }
}
