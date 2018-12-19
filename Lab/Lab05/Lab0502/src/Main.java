import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your number? ");
        int a = scan.nextInt();
        int sum = 0;
        while (true) {
            if (a <= 0) {
                break;
            }
            sum += Math.abs(a % 10);
            a /= 10;

        }
        System.out.printf("The sum of all digits is %d%n", sum);
    }
}
