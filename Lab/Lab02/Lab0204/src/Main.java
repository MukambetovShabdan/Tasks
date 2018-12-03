import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int L = scan.nextInt();
        double I = L * 2.54;
        System.out.println(L + " in. = " + I + " cm.");
    }
}
