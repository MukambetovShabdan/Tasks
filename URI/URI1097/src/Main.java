import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int j = i + 6;
        for (i = 1; i <= 9; i +=2) {

            for (j = i + 6; j >= i + 4; --j) {

                System.out.println("I=" + i + " J=" + j);
            }
        }


    }
}