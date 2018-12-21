import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                break;
            } else if (a < b) {
                System.out.println("Crescente");
            } else if (a > b) {
                System.out.println("Decrescente");
            }
        }
    }
}