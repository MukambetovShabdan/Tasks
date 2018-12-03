import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("some real number? ");
        double num = scan.nextDouble();
        System.out.print("|" + num + "|" + " = ");
        if (num >= 0){
            System.out.println(num);
        }else {
            num = - num;
            System.out.println(num);
        }
    }
}
