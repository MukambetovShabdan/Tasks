import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int hours = N/3600;
	int minutes = N % 3600 / 60;
	int seconds = N % 3600 % 60;
	System.out.print(hours + " : ");
		System.out.print(minutes + " : ");
		System.out.println(seconds);
    }
}
