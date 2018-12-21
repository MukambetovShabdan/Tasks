import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double xs = (double) (x);
                double ys = (double) (y);
                double res = xs/ys;
                System.out.println(res);
            }
        }
    }
}
