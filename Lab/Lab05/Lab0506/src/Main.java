import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            a = scan.nextInt();
            sum += a;

        } while (a != 0);

        System.out.printf("The sum is %d%n", sum);
    }
}