import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pw = "";

        while (true) {
            System.out.print("Enter a password: ");
            pw = scn.nextLine();

            if (pw.length() < 8) {
                System.out.println(
                        "Password is invalid. Needs to be at least 8 characters long and include at least one upper, lower or digit");
                continue;
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigitNumber = false;

            for (char ch : pw.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigitNumber = true;
                }
            }
            if (hasDigitNumber && hasLowerCase && hasDigitNumber) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println(
                        "Password is invalid. Needs to be at least 8 characters long and include at least one upper, lower or digit");
            }
        }
        scn.close();
    }
}