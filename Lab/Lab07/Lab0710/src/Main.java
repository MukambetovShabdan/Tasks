import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
        }
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < getMax(x)+1; i++) {
            if (eliminateDuplicates(x)[i] != 0) {
                System.out.print(eliminateDuplicates(x)[i] + " ");
            }
        }
    }

    private static int[] eliminateDuplicates(int[] x) {
        int[] e = new int[getMax(x)+1];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < getMax(x)+1; j++) {
                if (x[i] == j) {
                    e[j] = j;
                }
            }
        }
        return e;
    }

    private static int getMax(int[] x) {
        int max = x[0];
        for (int i = 0; i < 10; i++){
            if(max < x[i]){
                max = x[i];
            }
        }
        return max;
    }
}