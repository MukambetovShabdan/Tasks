import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Number of points? ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score > 40){
            System.out.println("You passed “Structured Programming”!!!");
            System.out.println("You should take “Object-Oriented Programming” in the next semester");
        } else {
            System.out.println("You failed “Structured Programming”!!!");
            System.out.println("You can take it again in the fall semester of 2019.");
        }
    }
}
