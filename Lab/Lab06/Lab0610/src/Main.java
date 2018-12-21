<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {

        System.out.println("i           m(i)");
        System.out.println("----------------");

        for (int i = 1; i <= 20; i++){
            System.out.printf("%d         %.4f%n", i, getMi(i));
        }
    }

    private static double getMi(int i) {
        double sum = 0;
        for(int j = 1; j <= i; j++){
            double mi = (double)j / (j + 1);
            sum += mi;
        }
        return sum;
    }
=======
public class Main {

    public static void main(String[] args) {

        System.out.println("i           m(i)");
        System.out.println("----------------");

        for (int i = 1; i <= 20; i++){
            System.out.printf("%d         %.4f%n", i, getMi(i));
        }
    }

    private static double getMi(int i) {
        double sum = 0;
        for(int j = 1; j <= i; j++){
            double mi = (double)j / (j + 1);
            sum += mi;
        }
        return sum;
    }
>>>>>>> 6becc31ecf0535cde9041672d21f2c62b7103190
}