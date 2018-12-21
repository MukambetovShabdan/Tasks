public class Main {

    public static void main(String[] args) {
        double f = 1;
        double res = 1;
        for (double i = 3; i <= 39; i += 2) {
            f *= 2;
            res += i / f;
        }
        System.out.printf("%.2f%n", res);
    }
}
