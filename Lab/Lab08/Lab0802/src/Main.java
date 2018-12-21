import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] cor = new char[]{'A', 'B', 'C', 'C', 'A', 'D', 'A', 'C', 'B', 'B'};
        char[][] ans = new char[8][10];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                String x = scan.next();
                ans[i][j] = x.charAt(0);
                if(ans[i][j] == (cor[j])){
                    count++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + count);
            count = 0;
        }
    }
}