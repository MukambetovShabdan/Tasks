import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int counter = 0;
        int a = 0;
        int d = 0;
        for (int i = 1; i <= 100; i++) {
            a = scan.nextInt();
            d++;
            a = a;
            if (a >= max) {
                max = a;
                counter = d;
            } else {
                max = max;
                counter = counter;
            }
        }

        System.out.println(max);
        System.out.println(counter);
    }
}
