import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 2 != 0) {
            for (int i = a; i <= a + 12; i += 2) {
                System.out.println(i);
            }
        } else if (a % 2 == 0) {
            for (int i = a + 1; i <= a + 12; i += 2) {
                System.out.println(i);
            }
        }
    }
}
