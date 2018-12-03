import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        for (int i = 1; i <= 1000000; i++) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                    x = scan.nextInt();
                    y = scan.nextInt();
                } else if (x > 0 && y < 0) {
                    System.out.println("quarto");
                    x = scan.nextInt();
                    y = scan.nextInt();
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                    x = scan.nextInt();
                    y = scan.nextInt();
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                    x = scan.nextInt();
                    y = scan.nextInt();
                }
             else if (x == 0 || y == 0) {
                return;
            }
        }
    }
}
