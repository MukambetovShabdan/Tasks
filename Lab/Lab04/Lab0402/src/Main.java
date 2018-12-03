import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Num of month: ");
	int a = scan.nextInt();
	if (a == 1 || a == 2 || a == 12){
	    System.out.println("winter!");
    }else if(a == 3 || a == 4 || a == 5){
        System.out.println("spring!");
    }else if(a == 6 || a == 7 || a == 8){
        System.out.println("summer!");
    }else if(a ==9 || a == 10 || a == 11){
        System.out.println("autumn!");
    }
    }
}
