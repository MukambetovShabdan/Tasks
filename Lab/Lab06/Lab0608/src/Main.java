import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();

        displayPattern(n);
    }

    private static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    if (j < n) {
                        System.out.print(n + 1 - j + " ");
                    }
                    if (j == n) {
                        System.out.println(n + 1 - j + " ");
                    }
                }
                if (i + j <= n) {
                    System.out.print("  ");
                }
            }
        }
    }
}