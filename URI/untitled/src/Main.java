import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[4];
        int i = 0;
        for (i = 0; i < a.length - 1; i++) {
            a[i] = scan.nextInt();
            for (int j = 0; j < a.length - 1; j++) {
                switcher(a[i], a[a.length - i]);
                break;
        }

        }
    }

    static void switcher(int a, int b) {
        int s = 0;
        s = a;
        a = b;
        b = s;
        System.out.println(a + ", " + b);
    }
}