import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st number? ");
        int A = scan.nextInt();
        System.out.print("2st number? ");
        int B = scan.nextInt();
        System.out.print("3st number? ");
        int C = scan.nextInt();
        int max = A;
        if (B > max) {
            max = B;
        }
        if (C > max) {
            max = C;
        }
        System.out.println("The value " + max + " is the greatest one.");
    }
}
