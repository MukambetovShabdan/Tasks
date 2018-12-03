import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       int sd = scan.nextInt();
        int sh = scan.nextInt();
        int sm = scan.nextInt();
        int ss = scan.nextInt();
        int fd = scan.nextInt();
        int fh = scan.nextInt();
        int fm = scan.nextInt();
        int fs = scan.nextInt();
        int h;
        int m;
        int s;
        int d;
        if (sd == fd) {
            d = fd - sd;
            h = fh - sh;
            m = fm - sm;
            s = fs - ss;
            if (sh == fh && sm <= fm && ss <= fs) {
                d = d;
                h = h;
                m = m;
                s = s;
            } else if (sh == fh && sm < fm && ss > fs) {
                d = d;
                h = h;
                m = m - 1;
                s = s + 60;
            } else if (sh < fh) {
                if (sm <= fm && ss <= fs) {
                    d = d;
                    h = h;
                    m = m;
                    s = s;
                } else if (sm < fm && ss > fs) {
                    d = d;
                    h = h;
                    m = m - 1;
                    s = s + 60;
                } else if (sm == fm && ss > fs) {
                    d = d;
                    h = h - 1;
                    m = m + 59;
                    s = s + 60;
                } else if (sm > fm && ss <= fs) {
                    d = d;
                    h = h - 1;
                    m = m + 60;
                    s = s;
                } else if (sm > fm && ss > fs) {
                    d = d;
                    h = h - 1;
                    m = m + 59;
                    s = s + 60;
                }
            }
            System.out.println(d + " dia(s)");
            System.out.println(h + " hora(s)");
            System.out.println(m + " minuto(s)");
            System.out.println(s + " segundo(s)");
        } else if (sd < fd) {
            d = fd - sd;
            h = fh - sh;
            m = fm - sm;
            s = fs - ss;
            if (sh < fh) {
                if (sm <= fm && ss <= fs) {
                    d = d;
                    h = h;
                    m = m;
                    s = s;
                } else if (sm < fm && ss > fs) {
                    d = d;
                    h = h;
                    m = m - 1;
                    s = s + 60;
                } else if (sm == fm && ss > fs) {
                    d = d;
                    h = h - 1;
                    m = m + 59;
                    s = s + 60;
                } else if (sm > fm && ss <= fs) {
                    d = d;
                    h = h - 1;
                    m = m + 60;
                    s = s;
                } else if (sm > fm && ss > fs) {
                    d = d;
                    h = h - 1;
                    m = m + 59;
                    s = s + 60;

                }

            } else if (sh == fh) {
                if (sm <= fm && ss <= fs) {
                    d = d;
                    h = h;
                    m = m;
                    s = s;
                } else if  (sm < fm && ss > fs) {
                    d = d;
                    h = h;
                    m = m - 1;
                    s = s + 60;
                } else if (sm == fm && ss > fs) {
                    d = d - 1;
                    h = h + 23;
                    m = m + 59;
                    s = s + 60;
                } else if (sm > fm && ss <= fs) {
                    d = d - 1;
                    h = h + 23;
                    m = m + 60;
                    s = s;
                } else if (sm > fm && ss > fs) {
                    d = d - 1;
                    h = h + 23;
                    m = m + 59;
                    s = s + 60;
                }
            } else if (sh > fh) {

                if (sm <= fm && ss <= fs) {
                    d = d - 1;
                    h = h + 24;
                    m = m;
                    s = s;
                } else if (sm < fm && ss > fs) {
                    d = d - 1;
                    h = h + 24;
                    m = m - 1;
                    s = s + 60;
                } else if (sm == fm && ss > fs) {
                    d = d - 1;
                    h = h + 23;
                    m = m + 59;
                    s = s + 60;
                } else if (sm > fm && ss <= fs) {
                    d = d - 1;
                    h = h + 23;
                    m = m + 60;
                    s = s;
                } else if (sm > fm && ss > fs) {
                    d = d - 1;

                    h = h + 23;
                    m = m + 59;
                    s = s + 60;
                }
            }
            System.out.println(d + " dia(s)");
            System.out.println(h + " hora(s)");
            System.out.println(m + " minuto(s)");
            System.out.println(s + " segundo(s)");
        }


    }
}