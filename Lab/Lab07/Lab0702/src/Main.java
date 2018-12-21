import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Month: ");
        int m = scan.nextInt();
        System.out.print("Year: ");
        int y = scan.nextInt();

        System.out.println("Days: " + getDay(m, y));

    }

    private static int getDay(int m, int y) {
        int f;
        if(y % 4 == 0 || y % 400 == 0 && y % 100 != 0){
            f = 29;
        }
        else{
            f = 28;
        }
        int x[] = {31, f, 31, 30, 31, 30, 31,31, 30, 31, 30, 31};
        return x[m - 1];


    }
}