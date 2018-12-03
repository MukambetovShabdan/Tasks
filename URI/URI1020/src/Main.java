import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int many_days = scan.nextInt();
        int years = many_days / 365;
        int months = many_days % 365 / 30;
        int days = many_days % 365 % 30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
