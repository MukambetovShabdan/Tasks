<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        final int finalNum = 50;
        final int numPerLine = 10;
        int n = 0;
        int num = 2;

        while (n < finalNum) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                n++;
                if (n% numPerLine == 0) {
                    System.out.println(num);
                } else {
                    System.out.print(num + " ");
                }
            }
            num++;
        }
    }
=======
public class Main {
    public static void main(String[] args) {
        final int finalNum = 50;
        final int numPerLine = 10;
        int n = 0;
        int num = 2;

        while (n < finalNum) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                n++;
                if (n% numPerLine == 0) {
                    System.out.println(num);
                } else {
                    System.out.print(num + " ");
                }
            }
            num++;
        }
    }
>>>>>>> 6becc31ecf0535cde9041672d21f2c62b7103190
}