import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int a = scan.nextInt();
        System.out.print("Enter " + a + " points: ");
        double[] len = new double[a];
        double[][] h = new double[a][2];
        double x1 = 0, x2 = 0, y1= 0 , y2 = 0;
        for (int i = 0; i < a; i++) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            h[i][0] = x;
            h[i][1] = y;
        }
        double sh = leng(h[0][0], h[0][1], h[1][0], h[1][1]);
        for (int i = 0; i < a; i++){
            for (int j = i+1; j < a; j++){
                len[i] = leng(h[i][0], h[i][1], h[j][0], h[j][1]);
                if(sh > len[i]){
                    sh = len[i];
                    x1 = h[i][0];
                    y1 = h[i][1];
                    x2 = h[j][0];
                    y2  = h[j][1];
                }
            }
        }
        System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)%n", x1, y1, x2, y2 );

    }

    private static double leng(double v, double v1, double v2, double v3) {
        double l = Math.sqrt(Math.pow(v2 - v, 2) + Math.pow(v3 - v1, 2));
        return l;
    }
}