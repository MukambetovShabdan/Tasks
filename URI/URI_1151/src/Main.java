import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int array[] = new int[a];
        if (a == 1) {
            System.out.println(0);
        } else if (a > 1 && a < 46) {
            array[0] = 0;
            array[1] = 1;
            System.out.print(array[0] + " " + array[1] + " ");
            for (int i = 2; i < a - 1; i++) {
                array[i] = array[i - 1] + array[i - 2];

                System.out.print(array[i] + " ");
            }
            System.out.println(array[a - 3] + array[a - 2]);
        }
    }
}