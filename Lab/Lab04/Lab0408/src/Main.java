import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your number? ");
        double weight = scan.nextDouble();
        if (weight <= 1 && weight > 0) {
            System.out.println(3.5 * weight);

        } else if (weight <= 3 && weight > 1) {
            System.out.println(5.5 * weight);

        } else if (weight <= 10 && weight > 3) {
            System.out.println(8.5 * weight);

        } else if (weight <= 20 && weight > 10) {
            System.out.println(10.5 * weight);

        } else if (weight > 50) {
            System.out.println("The package can not be printed!");

        }

    }
}
