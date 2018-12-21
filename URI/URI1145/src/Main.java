import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int x = scan.nextInt();
        int dx = x;
         int y = scan.nextInt();
        int i = 1;
        int f = 1;


        for (f = 1; f <= y / x; f++) {
            for (i = i; i < dx; i++) {
                System.out.printf( "%d ", i);
            }

            System.out.println(i);
            i = i+1;
            dx += x;



        }

    }
}
