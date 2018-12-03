import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c = scan.nextDouble();
        double d = Math.pow(b , 2) - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / 2 / a;
            double x2 = (-b - Math.sqrt(d)) / 2 / a;
            System.out.println("The equation has two roots: " + x1 + " and "+ x2);
        }else if (d == 0){
            double x = (-b)/ 2/a;
        System.out.println("The equation has one root " + x);
        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
