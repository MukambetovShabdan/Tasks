import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int al = 0;
        int gas = 0;
        int d = 0;
        while (a != 4) {
            a = scan.nextInt();
            if (a == 1) {
                al++;
            } else if (a == 2) {
                gas++;
            }
            if (a == 3) {
                d++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", al);
        System.out.printf("Gasolina: %d%n", gas);
        System.out.printf("Diesel: %d%n", d);
    }
}