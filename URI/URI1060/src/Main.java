import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0;
        int posvalue = 0;
        for (int i = 0; i < 6; i++) {
            a = scan.nextDouble();
            if (a > 0) {
                posvalue += 1;
            }

        }
        System.out.println(posvalue + " valores positivos");
    }
}
