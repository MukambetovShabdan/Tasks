import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int interwin = 0;
        int gremiowin = 0;
        int draw = 0;
        int a;
        int i = 0;
        int c = 0;
        int inter = scan.nextInt();
        int gremio = scan.nextInt();
        if (inter > gremio) {
            interwin += 1;
        } else if (inter == gremio) {
            draw += 1;
        } else if (gremio > inter) {
            gremiowin += 1;
        }
        while (i != 2) {
            c += 1;
            System.out.println("Novo grenal (1-sim 2-nao)");
            a = scan.nextInt();
            if (a == 1) {
                 inter = scan.nextInt();
                 gremio = scan.nextInt();
                if (inter > gremio) {
                    interwin += 1;
                } else if (inter == gremio) {
                    draw += 1;
                } else if (gremio > inter) {
                    gremiowin += 1;
                }
            } else if (a == 2) {
                break;
            }
        }
        System.out.println(c + " grenais");
        System.out.println("Inter:" + interwin);
        System.out.println("Gremio:" + gremiowin);
        System.out.println("Empates:" + draw);
        System.out.println("Inter venceu mais");

    }
}