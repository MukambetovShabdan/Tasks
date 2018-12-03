import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a degree in Celsius: " );
	double a = scan.nextDouble();
	double b = a * 9.0 / 5.0 + 32;
	System.out.print(a);
	System.out.printf(" Celsius is %.1f", b);
	System.out.println(" Fahrenheit ");
    }
}
