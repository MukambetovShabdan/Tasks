import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double v = scan.nextDouble();
	if (v < 0 || v > 100){
	    System.out.println("Fora de intervalo");
    }else if (v > 75.000001){
		System.out.println("Intervalo (75,100]");
	}else if (v > 50.000001) {
		System.out.println("Intervalo (50,75]");
	}else if (v > 25.000001) {
		System.out.println("Intervalo (25,50]");
	}else {
		System.out.println("Intervalo [0,25]");
	}
    }
}
