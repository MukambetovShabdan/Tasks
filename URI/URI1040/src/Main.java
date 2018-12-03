import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        float D = scan.nextFloat();
        float Average = (A * 2f + B * 3f + C * 4f + D * 1f)/( 2f + 3f + 4f + 1f);

        System.out.printf("Media: %.1f%n", Average);
        if (Average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (Average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (Average <= 6.9 && Average >= 5) {
            System.out.println("Aluno em exame.");
            float E = scan.nextFloat();
            System.out.println("Nota do exame: " + E );
            float fs = (Average + E) / 2f;
            if (fs >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (fs <= 4.9) {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", fs);

        }
    }
}
