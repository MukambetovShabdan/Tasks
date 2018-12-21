
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        System.out.println("I=" + a + " J=" + b);
        System.out.println("I=" + a + " J=" + c);
        System.out.println("I=" + a + " J=" + d);

        for (double k = 0; k < 0.8; k += 0.2) {
            double i = 0.2;
            double j1 = 1.2;
            double j2 = 2.2;
            double j3 = 3.2;
            i += k;
            j1 += k;
            j2 += k;
            j3 += k;
            System.out.printf("I=%.1f J=%.1f%n", i, j1);
            System.out.printf("I=%.1f J=%.1f%n", i, j2);
            System.out.printf("I=%.1f J=%.1f%n", i, j3);
        }
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        System.out.println("I=" + a + " J=" + b);
        System.out.println("I=" + a + " J=" + c);
        System.out.println("I=" + a + " J=" + d);

        for (double k = 0; k < 0.8; k += 0.2) {
            double i = 1.2;
            double j1 = 2.2;
            double j2 = 3.2;
            double j3 = 4.2;
            i += k;
            j1 += k;
            j2 += k;
            j3 += k;
            System.out.printf("I=%.1f J=%.1f%n", i, j1);
            System.out.printf("I=%.1f J=%.1f%n", i, j2);
            System.out.printf("I=%.1f J=%.1f%n", i, j3);
        }
        a = 2;
        b = 3;
        c = 4;
        d = 5;
        System.out.println("I=" + a + " J=" + b);
        System.out.println("I=" + a + " J=" + c);
        System.out.println("I=" + a + " J=" + d);


    }
}
