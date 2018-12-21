import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int a = scan.nextInt();
        int i;
        array[0] = a;
        System.out.printf("N[0] = %d%n", a);
        for (i = 1; i < 10; i++) {
            array[i] =a * 2;
            a = a*2;
            System.out.printf("N[%d] = %d%n", i, array[i]);
        }


    }
}


