import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fd = 3;
        int f = 1;
        for (int i = 1; i <= n; i++) {

            for (f = f; f <= fd; f++) {
                System.out.print(f + " ");
            }
            f += 1;
            fd += 4;

            System.out.println("PUM");
        }
    }
}
