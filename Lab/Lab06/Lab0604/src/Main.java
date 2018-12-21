import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.printf("%nGCD(%d, %d) = %d%n", a, b, gsd(a, b));
    }
    public static int gsd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("gcd(0, 0) is not defined");
        } else if (a == 0) {
            return  b;
        } else if (b == 0) {
            return a;
        }
        int value = Math.min(a, b);
        while(value != 0){
            if(a % value ==0 && b% value == 0){
            break;
            }
            value--;
        }
        return value;
    }
}