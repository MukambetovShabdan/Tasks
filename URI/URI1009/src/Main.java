import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String worker = scan.nextLine();
        Double fixedsalary = scan.nextDouble();
        Double bonus = scan.nextDouble();
        Double C = bonus / 100 * 15;
        System.out.printf("TOTAL = R$ %.2f%n", (fixedsalary + C));
    }
}