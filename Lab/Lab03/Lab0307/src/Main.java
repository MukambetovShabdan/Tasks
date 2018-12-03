import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numdays = scan.nextInt();
        String dayweek = "Sunday";
        String dayweek1 = "Sunday";
        if (day == 0 || day % 7 == 0) {
            dayweek = "Sunday";
        } else if (day == 1 || (day - 1) % 7 == 0) {
            dayweek = "Monday";
        } else if (day == 2 || (day - 2) % 7 == 0) {
            dayweek = "Tuesday";
        } else if (day == 3 || (day -3) % 7 == 0) {
            dayweek = "Wednesday";
        } else if (day == 4 || (day -4) % 7 == 0) {
            dayweek = "Thursday";
        } else if (day == 5 || (day - 5) % 7 == 0) {
            dayweek = "Friday";
        } else if (day == 6 || (day - 6) % 7 == 0) {
            dayweek = "Saturday";
        }
        if (day + numdays == 0 || (day + numdays) % 7 == 0) {
            dayweek1 = "Sunday";
        } else if (day + numdays == 1 || (day + numdays - 1) % 7 == 0) {
            dayweek1 = "Monday";
        } else if (day + numdays == 2 || (day + numdays - 2) % 7 == 0) {
            dayweek1 = "Tuesday";
        } else if (day + numdays == 3 || (day + numdays -3) % 7 == 0) {
            dayweek1 = "Wednesday";
        } else if (day + numdays == 4 || (day + numdays -4) % 7 == 0) {
            dayweek1 = "Thursday";
        } else if (day + numdays == 5 || (day + numdays - 5) % 7 == 0) {
            dayweek1 = "Friday";
        } else if (day + numdays == 6 || (day + numdays - 6) % 7 == 0) {
            dayweek1 = "Saturday";}
            System.out.println("Today is " + dayweek + " and future day is " + dayweek1);



        }
}
