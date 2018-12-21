public class Main {

    public static void main(String[] args) {
        double[] x = new double[5];
        for (int i = 0; i < x.length - 1; i++) {
            double min = x[i];
            int ind = i;
            for (int j = i + 1; j < 5; j++) {
                if (min > x[j]) {
                    min = x[j];
                    ind = j;
                }
            }
            if (ind != i) {
                x[ind] = x[i];
                x[i] = min;
            }
        }
    }
}