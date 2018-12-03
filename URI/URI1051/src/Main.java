import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        double tax =0;
        if (salary > 0 && salary <= 2000) {
            System.out.println("Isento");
        } else if (salary > 2000 && salary <= 3000) {
            tax = (salary - 2000)/ 100 * 8;
            System.out.printf("R$ %.2f%n", tax);
        } else if (salary > 3000 && salary <= 4500) {
            tax = (salary - 3000) / 100 * 18 + 80;
            System.out.printf("R$ %.2f%n", tax);
        } else if (salary > 4500) {
            tax = (salary - 4500)/ 100 * 28 + 350;
            System.out.printf("R$ %.2f%n", tax);
        }
    }
}
