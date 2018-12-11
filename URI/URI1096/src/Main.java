public class Main {

    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        for (i = 1; i <= 9; i += 2) {
            System.out.println("I=" + i + " J=" + j);
            while (j != 5) {
                j--;
                System.out.println("I=" + i + " J=" + j);
            }
            if (j == 5) {
                j = 7;
            }
        }
    }
}
