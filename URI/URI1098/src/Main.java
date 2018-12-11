import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float i;
        float d = 0.2f;

        for (i = 0; i <= 2.2; i += d) {

            for (float j = 1; j <= 3; j++) {
                System.out.println(" J= " + (i + j));
            }
        }
    }
}
