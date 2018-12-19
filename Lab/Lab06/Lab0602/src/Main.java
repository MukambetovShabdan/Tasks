import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int year = scan.nextInt();
        System.out.print("Month? ");
        int month = scan.nextInt();
        int days = daysOfMonths(year, month);
        System.out.printf("Num of days is %d%n", days);
    }

    static int daysOfMonths(int y, int m) {
        int days = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                boolean tr = isLeap(y);
                if (tr) {
                    days = 29;
                } else {
                    days = 28;
                }
        }
        return days;

    }

    static boolean isLeap(int y) {
        int year = y;
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
