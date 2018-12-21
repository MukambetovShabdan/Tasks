import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integers between 1 and 100: ");
        int[] x = new int[100];
        int a = 5;
        while(a != 0){
            a = scan.nextInt();
            x[a] += 1;
        }
        showOc(x);

    }

    private static void showOc(int[] x) {
        for (int i = 1; i < 100; i++){
            if(x[i] != 0){
                if(x[i] == 1){
                    System.out.printf("%d occurs %d time%n",i,x[i]);
                }
                else{
                    System.out.printf("%d occurs %d times%n",i,x[i]);
                }
            }
        }
    }
}