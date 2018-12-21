import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for (int i = 1; i<= n; i++){
		int i2 = i * i;
		int i3 = i * i * i;
	    System.out.printf("%d %d %d%n", i,i2,i3);
    }
    }
}
