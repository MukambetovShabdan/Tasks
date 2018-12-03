import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Year? ");
        int year = scan.nextInt();
        if (year % 400 == 0) {
            System.out.println("This is a leap year.");
        }else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("This is not a leap year.");
        }  else if (year % 400 != 0 && year % 100 != 0 && year % 4 == 0){
            System.out.println("This is a leap year.");
            }
        }
    }

