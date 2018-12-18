public class Main {

    public static void main(String[] args) {
        double res = 1;
        double resw = 1;
        for(double i = 2; i <=100;i++){
        res = res+ resw/i;
        }
        System.out.printf("%.2f%n", res);
    }
}
