public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        switcher(a, b);

        System.out.println(a + " ," + b);
    }

    static void switcher(int a, int b) {
        int s = a;
        a = b;
        b = s;
    }
}