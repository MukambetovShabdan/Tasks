import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three values: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && a >= c && b >= c) {
            System.out.println(c + ", " + b + ", " + a);
        } else if (a >= b && a >= c && b <= c) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (b >= a && b >= c && a >= c) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (b >= a && b >= c && c >= a) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (c >= a && c >= b && b >= a) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (c >= a && c >= b && a >= b) {
            System.out.println(b + ", " + a + ", " + c);
        }
    }
}
