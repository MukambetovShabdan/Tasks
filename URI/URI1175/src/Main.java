import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = new int[20];
        for (int f = 0; f < 20; f++) {
            switcher(a[f], a[a.length - f]);
        }

    }

     static void switcher(int x ,int y) {
        int t = 0;
        int[]a = new int[20];
        int i = 0;
        for (i = 0; i < 20; i++) {
            x = a[i];
            y = a[a.length - i];
            a[i] = scan.nextInt();
            t = a[i];
            a[i] = a[a.length - i];
            a[a.length - i] = t;
        }
        for (int h = 0; h < a.length; h++) {
            System.out.printf("N[%d] = %d%n", h, a[h]);
        }
    }
}