import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("A = ");
            int a = scan.nextInt();
            System.out.print("B = ");
            int b = scan.nextInt();

            System.out.printf("GCD(%d, %d) = %d", a, b, gcd(a, b));
        }catch (IllegalArgumentException e){
            System.out.println("GCD(0, 0) is not defined");
        }catch(InputMismatchException e){
            System.out.println("Incorrect integer");
        }
    }

    static int gcd(int x, int y) {
        if(x == 0 && y == 0){
            throw new  IllegalArgumentException("GCD(0, 0) is not defined");
        }
        int a = Math.abs(x);
        int b = Math.abs(y);

        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }
        int r;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}