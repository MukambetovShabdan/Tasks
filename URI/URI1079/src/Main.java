import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int q = scan.nextInt();
	float d,a,b,c;
	for (int i = 1; i <= q ;i++){
		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();
	    d = ((a * 2) + (b * 3) + (c * 5))/10;
		System.out.printf("%.1f%n", d);
        }
    }
}
