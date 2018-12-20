import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(isPalindrome(a)){
            System.out.println("This integer is palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }

    }
    private static boolean isPalindrome(int a) {
        if(reverse(a) == a){
            return true;
        }
        return false;
    }

    private static int reverse(int a) {
        int n = 1, s = 0, sum = 0;
        while(n != 0){
            n = a / 10;
            s = a % 10;
            a = n;
            sum += s;
            sum = sum * 10;
        }
        return sum / 10;
    }
}