
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int s = scan.nextInt();
        int AB = (a + b + Math.abs(a - b)) / 2;
        int MaiorAB = (AB + s + Math.abs(AB - s)) / 2;
        System.out.println(MaiorAB + " eh o maior");

    }
}
