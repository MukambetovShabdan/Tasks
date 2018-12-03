import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0.1;
        for (int i = 1; i < 10; i++) {
            a += 0.1;
        }
        ;
        if (a == 1.0) {
            System.out.println(a +" Equal");
        } else {
            System.out.println(a +" Not equal");
        }
    }
}
