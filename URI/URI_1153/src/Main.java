import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int fact = N;
        int d = 1;

//        N = N * (N-1) * (N-2) * (N-3) * ... * 1.

        while (true) {
            for (int i = 1; i <= N; i++) {
                if(N == i){break;}
                fact = fact * (N - i);
                d = N - i ;
                }

            if (d <= 1) {
                break;
            }
        }
        System.out.println(fact);
    }
}