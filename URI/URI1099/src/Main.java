import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (b > a + 1 && a % 2 == 0) {
                for (int d = a + 1; d < b; d += 2) {
                    d += d;
                    System.out.print(d);
                }
            }
           else if (b > a + 1 && a % 2 == 1) {
                for (int d = a + 2; d < b; d += 2) {
                    d += d;
                    System.out.print(d);
                }
            }else if (a > b + 1 && b % 2 == 0) {
                for (int d = b + 1; d < a; d += 2) {
                    d += d;
                    System.out.print(d);
                }
            }
            else if (a > b + 1 && b % 2 == 1) {
                for (int d = b + 2; d < a; d += 2) {
                    d += d;
                    System.out.print(d);
                }
            }else if (Math.abs(a - b) == 0||Math.abs(a - b) == 1){
                System.out.print("0");
            }
        }
    }
}
