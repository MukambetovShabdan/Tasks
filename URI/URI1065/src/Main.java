import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a;
        int b = 0;
	for (int i = 1; i <= 5; i++){
	    a = scan.nextInt();
	    if (a % 2 == 0){

           b += 1;
	    }
    } System.out.println(b + " valores pares");
    }
}
