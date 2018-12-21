import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, sum = 0, count = 0, ave = 0;
        int[] x = new int[100];
        for (int i = 0; i < 100 && a >= 0; i++) {
            a = scan.nextInt();
            x[i] = a;
            count++;
            sum += a;
        }
        ave = sum / count;
        check(x, ave);

    }

    private static void check(int[] x, int ave) {
        for (int i = 0; i < 100; i++){
            if(x[i] >= ave && x[i] != 0){
                System.out.printf("%d is above the average%n", x[i]);
            }
            else if(x[i] < ave && x[i] != 0){
                System.out.printf("%d is below the average%n", x[i]);
            }
        }
    }
}