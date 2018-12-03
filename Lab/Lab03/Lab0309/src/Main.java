import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Scissor (0), Rock (1), Paper (2): ");
        int compchoice = (int)( Math.random() * 3);
        int choice = scan.nextInt();
        switch (choice) {
            case 0:
                switch (compchoice) {
                    case 0:
                        System.out.println("The computer is scissor. You are scissor");
                        System.out.println("it is the draw");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are scissor");
                        System.out.println("you are lost");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are scissor");
                        System.out.println("you are win");
                }
                break;
            case 1:
                switch (compchoice) {
                    case 1:
                        System.out.println("The computer is rock. You are rock");
                        System.out.println("it is the draw");
                        break;
                    case 2:
                        System.out.println("The computer is paper. You are rock");
                        System.out.println("you are lost");
                        break;
                    case 0:
                        System.out.println("The computer is scissor. You are rock");
                        System.out.println("you are win");
                }
                break;
            case 2:
                switch (compchoice) {
                    case 2:
                        System.out.println("The computer is paper. You are paper");
                        System.out.println("it is the draw");
                        break;
                    case 0:
                        System.out.println("The computer is scissor. You are paper");
                        System.out.println("you are lost");
                        break;
                    case 1:
                        System.out.println("The computer is rock. You are paper");
                        System.out.println("you are win");
                }
                break;
        }
    }

}



























