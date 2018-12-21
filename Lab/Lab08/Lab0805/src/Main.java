import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] x = new double[3][3];
        double[][] y = new double[3][3];
        System.out.print("Enter matrix1: ");
        readM(x);
        System.out.print("Enter matrix2: ");
        readM(y);

        multiplyM(x, y);

        showM(x, y, multiplyM(x, y));
    }

    private static void showM(double[][] x, double[][] y, double[][] mul) {
        for (int i = 0; i < 3; i++) {
            if (i != 1) {
                System.out.printf("%.1f %.1f %.1f     %.1f %.1f %.1f     %.1f %.1f %.1f%n",
                        x[i][0],x[i][1], x[i][2],y[i][0],y[i][1], y[i][2],mul[i][0],mul[i][1], mul[i][2]);
            }
            if (i == 1) {
                System.out.printf("%.1f %.1f %.1f  *  %.1f %.1f %.1f  =  %.1f %.1f %.1f%n",
                        x[i][0],x[i][1], x[i][2],y[i][0],y[i][1], y[i][2],mul[i][0],mul[i][1], mul[i][2]);
            }
        }
    }


    private static double[][] multiplyM(double[][] x, double[][] y) {
        double[][] mul = new double[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mul[i][j] = x[i][0] * y[0][j] + x[i][1] * y[1][j] + x[i][2] * y[2][j];
            }
        }
        return mul;
    }

    private static double[][] readM(double[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
        return m;
    }
}