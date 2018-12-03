import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int V = scan.nextInt();
        double s = 12.0 ;
        double S = t * V / s;
        System.out.printf("%.3f%n", S);
    }
}
