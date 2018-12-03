import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Edges? ");
	double a, b, c;
	a = scan.nextDouble();
	b = scan.nextDouble();
	c = scan.nextDouble();
	if (a >= b + c || b >= a+c || c >=a + b){
	    System.out.println("Your input is invalid!");
    }else {
	    double p = a + b + c;
	    System.out.println("Perimeter is "+ p);
    }
    }
}
