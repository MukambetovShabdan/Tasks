import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int a = scan.nextInt();
        int[] t = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("Enter %d element: ", i);
            int x = scan.nextInt();
            t[i] = x;
        }
        System.out.println("Before reversing: ");
        for (int e: t){
            System.out.print(e + " ");
        }
        printArray(getReverse(t));

    }
    private static void printArray(int[] x) {
        System.out.println("\nAfter reversing: ");
        for (int e: x){
            System.out.print(e + " ");
        }
    }
    private static int[] getReverse(int[] t) {
        int[] x = new int[t.length];
        for (int i = 0; i < t.length; i++){
            x[i] = t[t.length- 1 -i];
        }
        return x;
    }
}