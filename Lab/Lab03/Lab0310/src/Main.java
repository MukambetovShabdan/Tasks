import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the point with two coordinates: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double dist = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (dist > 10) {
            System.out.println("Point (" + a + ", " + b + ") is not in the circle");
        } else if (dist <= 10) {
            System.out.println("Point (" + a + ", " + b + ") is in the circle");
        }
    }
}
