import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();

        System.out.println(sumOfDigits(a));

    }

    private static int sumOfDigits(long a) {
        int s = 0, n = 1, sum = 0;
        while(n != 0){
            n = (int)a / 10;
            s = (int)a % 10;
            sum += s;
            a = n;
        }
        return sum;
    }
}