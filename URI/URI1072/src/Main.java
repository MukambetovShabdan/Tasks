import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= N; i++) {
            a = scan.nextInt();
            if (a >= 10 && a <= 20)
                b += 1;
             else c += 1;
        }
        System.out.println(b + " in");
        System.out.println(c + " out");
    }
}
