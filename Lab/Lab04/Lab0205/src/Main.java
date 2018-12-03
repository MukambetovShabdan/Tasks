import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Temperatures in degrees Fahrenheit? ");
        double a = scan.nextDouble();
        double b = (a - 32) * 5 / 9;
        System.out.printf("The temperature in degrees Celsius is %.2f%n", b);
    }
}
