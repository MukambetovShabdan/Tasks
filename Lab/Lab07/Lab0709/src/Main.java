import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[]x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
        }
        System.out.println("The index of smallest number is " + getSmallestIndex(x));
    }

    private static int getSmallestIndex(int[] x) {
        int min = x[0];
        int index = 0;
        for (int i = 0; i < 10; i++){
            if(min > x[i]){
                min =  x[i];
                index = i;
            }
        }
        return index;
    }
}