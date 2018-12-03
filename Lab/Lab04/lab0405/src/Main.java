import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int year = scan.nextInt();
        System.out.print("Month? ");
        int month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("Number of days is 31");
                break;
            case 3:
                System.out.println("Number of days is 31");
                break;
            case 5:
                System.out.println("Number of days is 31");
                break;
            case 7:
                System.out.println("Number of days is 31");
                break;
            case 8:
                System.out.println("Number of days is 31");
                break;
            case 10:
                System.out.println("Number of days is 31");
                break;
            case 12:
                System.out.println("Number of days is 31");
                break;
            case 4:
                System.out.println("Number of days is 30");
                break;
            case 6:
                System.out.println("Number of days is 30");
                break;
            case 9:
                System.out.println("Number of days is 30");
                break;
            case 11:
                System.out.println("Number of days is 30");
                break;
            case 2:
                if (year % 400 == 0) {
                    System.out.println("Number of days is 29");
                }else if (year % 100 == 0){
                    System.out.println("Number of days is 28");
                }else if (year % 4 == 0){
                    System.out.println("Number of days is 29");
                }
                break;
        }
    }
}