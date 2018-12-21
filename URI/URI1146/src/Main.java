import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 1;
        for (int i = 1; i < a; i++) {
            System.out.print(i + " ");
        }
        System.out.println(a);

        while (b != 0) {
            b = scan.nextInt();
            if (b == 0) {
                break;
            } else {
                for (int f = 1; f < b; f++) {
                    System.out.print(f + " ");
                }
                System.out.println(b);
            }
        }
    }
}