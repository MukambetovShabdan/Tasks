import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int x = 0;
        int res = 0;
        for (int i = 1; i <= a; i++) {
            x = scan.nextInt();
            int y = scan.nextInt();

            if (x % 2 == 0) {
                x += 1;
            } else {
                x = x;
            }
        for (int f = 1; f<= y; f++){

                res = res+x;
            x= x+2;
        }
            System.out.println(res);
            res = 0;

        }

    }
}
