import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        double hundred = N / 100;
        double fifty = N % 100 / 50;
        double twenty = N % 100 % 50 / 20;
        double ten = N % 100 % 50 % 20 / 10;
        double five = N % 100 % 50 % 20 % 10 / 5;
        double two = N % 100 % 50 % 20 % 10 % 5 / 2;
        int hundred1 = (int)(hundred);
        int fifty1 = (int)(fifty);
        int twenty1 = (int)(twenty);
        int ten1 = (int)(ten);
        int five1 = (int)(five);
        int two1 = (int)(two);
       /* */
        System.out.println("NOTAS:");
        System.out.println(hundred1 + " nota(s) de R$ 100.00");
        System.out.println(fifty1 + " nota(s) de R$ 50.00");
        System.out.println(twenty1 + " nota(s) de R$ 20.00");
        System.out.println(ten1 + " nota(s) de R$ 10.00");
        System.out.println(five1 + " nota(s) de R$ 5.00");
        System.out.println(two1 + " nota(s) de R$ 2.00");

        N = N * 100;
        int doub = (int) ( N - (hundred1 * 100  + fifty1 * 50 + twenty1 * 20 + ten1 * 10 + five1 * 5 + two1 * 2));
        int one = (int) (doub % 100);
        int q = (int) (doub % 100 / 50);
        int w = (int) (doub % 100 % 50 / 25);
        int e = (int) (doub % 100 % 50 % 25 / 10);
        int r = (int) (doub % 100 % 50 % 25 % 10 / 5);
        int t = (int) (doub % 100 % 50 % 25 % 10 % 5);

        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(q + " moeda(s) de R$ 0.50");
        System.out.println(w + " moeda(s) de R$ 0.25");
        System.out.println(e + " moeda(s) de R$ 0.10");
        System.out.println(r + " moeda(s) de R$ 0.05");
        System.out.println(t + " moeda(s) de R$ 0.01");


    }
}
