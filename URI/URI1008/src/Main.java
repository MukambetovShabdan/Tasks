import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        Double C = scan.nextDouble();
        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f%n", (B*C));

    }
}
