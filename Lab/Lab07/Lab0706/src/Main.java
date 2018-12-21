import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int a = scan.nextInt();
        System.out.print("Enter " + a + " scores: ");
        int[] x = new int[a];
        for (int i = 0; i < a; i++) {
            int s = scan.nextInt();
            x[i] = s;
            if(s >= 80) {
                System.out.println("Student " + i + " score is " + x[i] + " and grade is A");
            }
            else if(s >= 60 && s < 80) {
                System.out.println("Student " + i + " score is " + x[i] + " and grade is B");
            }
            else if(s >= 40 && s < 60) {
                System.out.println("Student " + i + " score is " + x[i] + " and grade is C");
            }
            else if(40 >= s) {
                System.out.println("Student " + i + " score is " + x[i] + " and grade is D");
            }
        }
    }
}