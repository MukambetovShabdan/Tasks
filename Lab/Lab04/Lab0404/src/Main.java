import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("complexity level? ");
        int a = scan.nextInt();
        if (a > 5 || a < 0) {
            System.out.println("wrong number");
        } else if (a == 5 || a == 4) {
            System.out.println("pro gamer");
        } else if (a == 3 || a == 2) {
            System.out.println("experienced gamer");
        } else if (a == 1) {
            System.out.println("beginner");
        } else if (a == 0) {
            System.out.println("total newbie");
        }

    }
}
