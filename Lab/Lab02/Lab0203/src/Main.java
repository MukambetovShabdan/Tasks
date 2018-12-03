import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int V = scan.nextInt();
        V = V % 10 + V / 10 % 10 + V / 100 % 10 + V / 1000 ;
        System.out.println("The sum of all digits is " +  V);
    }
}
