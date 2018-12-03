import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        if (A > B && A > C && B > C) {
            System.out.printf("%d%n%d%n%d%n%n", C, B, A);
        } else if (A >= B && A >= C && B <= C) {
            System.out.printf("%d%n%d%n%d%n%n", B, C, A);
        } else if (B >= A && B >= C && A <= C) {
            System.out.printf("%d%n%d%n%d%n%n", A, C, B);
        } else if (B >= A && B >= C && A >= C) {
            System.out.printf("%d%n%d%n%d%n%n", C, A, B);
        } else if (C >= A && C >= B && A <= B) {
            System.out.printf("%d%n%d%n%d%n%n", A, B, C);
        } else if (C >= A && C >= B && B <= A) {
            System.out.printf("%d%n%d%n%d%n%n", B, A, C);
        }
        System.out.printf("%d%n%d%n%d%n", A, B, C);
    }
}
