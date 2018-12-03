import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sh, sm, fh, fm;
        sh = scan.nextInt();
        sm = scan.nextInt();
        fh = scan.nextInt();
        fm = scan.nextInt();
        int Ah, Am;
        if (sh < fh && sm <= fm) {
            Ah = fh - sh;
            Am = fm - sm;
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh < fh && sm > fm) {
            Ah = fh - sh - 1;
            Am = 60 - Math.abs(fm - sm);
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh > fh && sm <= fm) {
            Ah = (24 - sh) + (0 + fh);
            Am = fm - sm;
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh > fh && sm > fm) {
            Ah = (24 - sh) + (0 + fh) - 1;
            Am = 60 - Math.abs(fm - sm);
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh == fh && sm == fm) {
            Ah = 24;
            Am = 0;
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh == fh && sm > fm) {
            Ah = 0;
            Am = 60 - Math.abs(fm - sm);
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        } else if (sh == fh && sm <= fm) {
            Ah = 0;
            Am = fm - sm;
            System.out.println("O JOGO DUROU " + Ah + " HORA(S) E " + Am + " MINUTO(S)");
        }


    }
}
