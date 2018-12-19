import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int a = scan.nextInt();
        System.out.print("Coordinate of 1st point: ");
        int b = scan.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        int c = scan.nextInt();
        int dist1 = abs(a - b);
        int dist2 = abs(a - c);

        if (dist1 > dist2) {
            System.out.printf("2nd point is closer. Distance is %d%n", dist2);
        } else if (dist1 < dist2) {
            System.out.printf("1st point is closer. Distance is %d%n", dist1);
        } else {
            System.out.printf("The same distance. Distance is %d%n", dist1);
        }


//        System.out.println(dist1);
//        System.out.println(dist2);
    }

    static int abs(int x) {
        int n = x;
        if (n >= 0) {
            n = n;
        } else {
            n = -n;
        }
        return n;
    }
}