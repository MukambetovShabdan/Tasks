import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int V = 30;
        int T = (S * 60) / V;
        System.out.print(T);
        System.out.println(" minutos");

    }
}
