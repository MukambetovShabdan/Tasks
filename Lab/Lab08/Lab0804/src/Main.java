import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] x = new int[9][9];
        System.out.println("Enter a Sudoku puzzle solution: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                x[i][j] = scan.nextInt();
            }
        }

        System.out.println(isValid(x) ? "Valid solution" : "Invalid solution");
    }

    private static boolean isValid(int[][] x) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(x[i][j] < 0 || x[i][j] > 9 || !(isValid(i, j, x))){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int i, int j, int[][] x) {
        for (int col = 0; col < 9; col++){
            if(col != j && x[i][col] == x[i][j]){
                return false;
            }
        }
        for (int r = 0; r < 9; r++){
            if(r != i && x[r][j] == x[i][j]){
                return false;
            }
        }
        for (int r = (i / 3) * 3; r < (i / 3) * 3 + 3; r++){
            for (int c = (j / 3) * 3; c < (j / 3) * 3 + 3; c++){
                if(r != i && c != j && x[r][c] == x[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}

