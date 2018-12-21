import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int f = 0; f<1000; f++){
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
            if (a <= 0 || b <= 0){
                break;
            }
            else if (a > 0 && b > 0) {
                if (a > b) {
                    for (int i = b; i <= a; i++) {
                        sum += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + sum);
                } else if (b > a) {
                    for (int i = a; i <= b; i++) {
                        sum += i;
                        System.out.print(i + " ");
                    }
                    System.out.println("Sum=" + sum);
                } else if (a == b) {
                    System.out.println(a + "Sum=" + b);
                }
            }
        }
    }
}
