import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("i                     m(i)");
        System.out.println("--------------------------");

        for (int j = 1; j < 1000; j+=100){
            if(j == 1){
                System.out.printf("%d                   %.4f%n", j ,calcMi(j));
            }
            else {
                System.out.printf("%d                 %.4f%n", j ,calcMi(j));
            }
        }
    }

    private static double calcMi(int i) {
        double s = 0;
        for (int j = 1; j <= i; j++){
            double mi = 4 * ((Math.pow(-1, j + 1)) / (double)(2 * j - 1));
            s += mi;
        }
        return s;
    }
}