import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int A;
        int B;
        if (a >= b) {
            A = 24 - a;
            B = 0 + b;
            System.out.println("O JOGO DUROU " + (A + B) + " HORA(S)");
        } else if (a < b) {
            A = 0 + a;
            B = 0 + b;
            System.out.println("O JOGO DUROU " + (B - A) + " HORA(S)");
        }

    }
}
