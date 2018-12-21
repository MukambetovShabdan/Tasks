import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Rows: ");
        int r = scan.nextInt();
        System.out.print("Columns: ");
        int c = scan.nextInt();

        int[][] x = new int[r][c];

        System.out.printf("Enter %d rows and %d columns: %n", r, c);

        readArray(x);

        System.out.println("Sum of all elements: " + sum(x));
    }

    private static long sum(int[][] x) {
        int sum = 0;
        for(int[] r: x){
            for (int e: r){
                sum += e;
            }
        }
        return sum;
    }

    private static void readArray(int[][] x) {
        for (int i = 0 ; i < x.length; i++){
            for (int j= 0 ; j < x[i].length; j++){
                x[i][j] = scan.nextInt();
            }
        }
    }
}