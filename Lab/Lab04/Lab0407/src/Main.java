import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your numbers? ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int acomp = (int) (Math.random() * 100);
        int bcomp = (int) (Math.random() * 100);
        int ccomp = (int) (Math.random() * 100);
        if (a == acomp && b == bcomp && c == ccomp) {
            System.out.println("You have won 10000$");
        } else if (a == bcomp && b == ccomp && c == acomp || a == ccomp && b == acomp && c == bcomp) {
            System.out.println("You have won 3000$");
        } else if (a == acomp || a == bcomp || a == ccomp || b == acomp || b == bcomp || b == ccomp | c == acomp || c == bcomp || c == ccomp) {
            System.out.print("You have won 1000$");
        } else if (a == acomp && b == ccomp && c == bcomp || b == bcomp && a == ccomp && c == acomp || c == ccomp && a == bcomp && b == ccomp) {
            System.out.println("You have won 3000$");
        } else {
            System.out.println("You have not won anything");
        }
    }
}
