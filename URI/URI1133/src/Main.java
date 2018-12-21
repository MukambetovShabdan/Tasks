import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            for (int i = b + 1; i < a; i++) {
                int res = (i % 5);
                if (res == 2 || res == 3) {
                    System.out.println(i);
                }
            }
        } else if (b > a) {
            for (int i = a + 1; i < b; i++) {
                int res = (i % 5);
                if (res == 2 || res == 3) {
                    System.out.println(i);
                }
            }
        }
    }
}
