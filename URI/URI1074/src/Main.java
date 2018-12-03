import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a;
        for (int i = 1; i <= N; i++) {
            a = scan.nextInt();
            if (a % 2 == 0 && a > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (a % 2 == 0 && a < 0) {
                System.out.println("EVEN NEGATIVE");
            }else if (a % 2 != 0 && a > 0) {
                System.out.println("ODD POSITIVE");
            }else if (a % 2 != 0 && a < 0) {
                System.out.println("ODD NEGATIVE");
            }else if (a == 0){
                System.out.println("NULL");
            }
        }
    }
}
