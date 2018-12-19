

/*import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Number of tests? ");
        int a = scan.nextInt();
        int correct = 0;
        int incorrect = 0;

        int i = 0;
        while (i != a) {
            int b = rnd.nextInt(101);
            int c = rnd.nextInt(101);
            System.out.print(b + " + " + c + " = ");
            int res = scan.nextInt();
            if (b + c == res) {
                correct++;
            } else {
                incorrect++;
            }
            i++;
        }

        System.out.printf("%d correct answers %n", correct);
        System.out.printf("%d incorrect answers %n", incorrect);

    }
}
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Number of tests? ");
        int a = scan.nextInt();
        int correct = 0;
        int incorrect = 0;

        for (int i = 1; i <= a; i++) {
            int b = rnd.nextInt(101);
            int c = rnd.nextInt(101);
            System.out.print(b + " + " + c + " = ");
            int res = scan.nextInt();

            if (b + c == res) {
                correct++;
            } else {
                incorrect++;
            }
        }
        System.out.printf("%d correct answers %n", correct);
        System.out.printf("%d incorrect answers %n", incorrect);
    }
}