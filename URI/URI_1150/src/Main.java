import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int z;
        while (true) {
            z = scan.nextInt();
            if (z > x) {
                break;
            }
        }
        int dx = 1;
        int c = 1;
        for (int i = x; i <= z; i += x + dx) {
            dx++;
            c++;
        }

System.out.println(c);
    }
}
