import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        double percent;
        double salaper;
        if (salary > 0.0 && salary <= 400.00) {
            percent = 15;
            salaper = salary / 100 * percent;
            salary = salary + salaper;
            System.out.printf("Novo salario: %.2f%n", salary);
            System.out.printf("Reajuste ganho: %.2f%n", salaper);
            System.out.println("Em percentual: 15 %");
        } else if (salary <= 800.00) {
            percent = 12;
            salaper = salary / 100 * percent;
            salary = salary + salaper;
            System.out.printf("Novo salario: %.2f%n", salary);
            System.out.printf("Reajuste ganho: %.2f%n", salaper);
            System.out.println("Em percentual: 12 %");
        } else if (salary <= 1200.00) {
            percent = 10;
            salaper = salary / 100 * percent;
            salary = salary + salaper;
            System.out.printf("Novo salario: %.2f%n", salary);
            System.out.printf("Reajuste ganho: %.2f%n", salaper);
            System.out.println("Em percentual: 10 %");
        } else if (salary <= 2000) {
            percent = 7;
            salaper = salary / 100 * percent;
            salary = salary + salaper;
            System.out.printf("Novo salario: %.2f%n", salary);
            System.out.printf("Reajuste ganho: %.2f%n", salaper);
            System.out.println("Em percentual: 7 %");
        } else if (salary > 2000.00) {
            percent = 4;
            salaper = salary / 100 * percent;
            salary = salary + salaper;
            System.out.printf("Novo salario: %.2f%n", salary);
            System.out.printf("Reajuste ganho: %.2f%n", salaper);
            System.out.println("Em percentual: 4 %");
        }
    }
}
