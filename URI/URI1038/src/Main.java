import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int xy = scan.nextInt();
        double y;
        if (x == 1){
           System.out.printf("Total: R$ %.2f%n",xy * 4.00);
        } else if (x == 2){
            System.out.printf("Total: R$ %.2f%n",xy * 4.50);
        } else if (x == 3){
            System.out.printf("Total: R$ %.2f%n",xy * 5.00);
        } else if (x == 4){
            System.out.printf("Total: R$ %.2f%n",xy * 2.00);
        } else if (x == 5){
            System.out.printf("Total: R$ %.2f%n",xy * 1.50);
        }
    }
}
