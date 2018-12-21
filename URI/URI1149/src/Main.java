import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int dn = 0;
        while (true) {
            int n = scan.nextInt();
            if (n > 0) {
                for (int i = a; i < n + a; i++) {
                    dn += i;
                }
                break;
            }

        }
        System.out.println(dn);

    }
}