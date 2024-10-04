import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a text:");
        String originTxt = scn.nextLine();

        String txt = originTxt.toLowerCase().replaceAll("[^a-z]", "");
        boolean isPalindrome = true;
        int start = 0;
        int end = txt.length() - 1;
        while (start < end) {
            if (txt.charAt(start) != txt.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(originTxt + " is a palindrome.");
        } else {
            System.out.println(originTxt + " is not a palindrome.");
        }
        scn.close();
    }
}
