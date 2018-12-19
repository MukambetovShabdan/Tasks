import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your string? ");
        String word = scan.nextLine();
        int l = 1;
        int h = word.length() - 1;
        boolean isPalindrome = true;
        while (h > l) {
            if (word.charAt(l) != word.charAt(h)) {
                isPalindrome = false;
                break;
            }
            l++;
            h--;
        }
        if (isPalindrome) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }
}
