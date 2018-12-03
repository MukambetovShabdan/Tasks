import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of points? ");
        int A = scan.nextInt();
        if (A > 100 || A < 0) {
            System.out.println("impossible grade");
        } else {
            if (A >= 90) {
                System.out.println("Grade: A");
            } else if (A >= 80) {
                System.out.println("Grade: B");
            } else if (A >= 70) {
                System.out.println("Grade: C");
            } else if (A >= 60) {
                System.out.println("Grade: D");
            } else if (A < 60) {
                System.out.println("Grade: F");
            }
        }
    }
}
