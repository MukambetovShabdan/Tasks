import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        N = N * 100;
        int hundred = (int) (N / 10000);
        int fifty = (int) (N % 10000 / 5000);
        int twenty = (int) (N % 10000 % 5000 / 2000);
        int ten = (int) (N % 10000 % 5000 % 2000 / 1000);
        int five = (int) (N % 10000 % 5000 % 2000 % 1000 / 500);
        int two = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 / 200);

        int one = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200/ 100);
        int q = (int) ( N % 10000 % 5000 % 2000 % 1000 % 500 % 200% 100 / 50);
        int w = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 / 25);
        int e = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25 / 10);
        int r = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25 % 10 / 5);
        int t = (int) (N % 10000 % 5000 % 2000 % 1000 % 500 % 200 % 100 % 50 % 25 % 10 % 5);

        System.out.println("NOTAS:");
        System.out.println(hundred + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(q + " moeda(s) de R$ 0.50");
        System.out.println(w + " moeda(s) de R$ 0.25");
        System.out.println(e + " moeda(s) de R$ 0.10");
        System.out.println(r + " moeda(s) de R$ 0.05");
        System.out.println(t + " moeda(s) de R$ 0.01");


    }
}
