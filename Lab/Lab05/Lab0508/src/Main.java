public class Main {

    public static void main(String[] args) {
        System.out.println("              Multiplication Table");
        System.out.println();
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.printf("\n----------------------------------------%n");
        for (int row = 1; row <= 9; row++) {
            System.out.print(row + " | ");
            for (int column = 1; column <= 9; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
    }
}
