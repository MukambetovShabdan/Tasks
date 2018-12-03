import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double R = scan.nextDouble();
        Double pi = 3.14159;
        Double V = (4 / 3.0) * pi * R * R * R;
        System.out.printf("VOLUME = %.3f%n", V);
    }
}
