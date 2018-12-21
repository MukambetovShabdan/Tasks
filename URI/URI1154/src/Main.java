import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        double finage = 0;
        double cont = 0;
        while (true) {
            age = scan.nextInt();
            if (age < 0) {
                break;
            } else {

                finage += age;
                cont++;
            }
        }
        System.out.printf("%.2f%n", finage / cont);
    }
}