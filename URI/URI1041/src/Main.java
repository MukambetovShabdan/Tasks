import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        if (x == 0f && y == 0f){
            System.out.println("Origem");
        }else if (x == 0f && y != 0f){
            System.out.println("Eixo Y");
        }else if (x != 0f && y == 0f){
            System.out.println("Eixo X");
        }else if (x > 0f && y > 0f){
            System.out.println("Q1");
        }else if (x < 0f && y > 0f){
            System.out.println("Q2");
        }else if (x < 0f && y < 0f){
            System.out.println("Q3");
        }else if (x > 0f && y < 0f){
            System.out.println("Q4");
        }
    }
}
