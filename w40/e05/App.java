package e05;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner scn = new Scanner(System.in);
        String combineNames = "";

        while (true) {
            System.out.println("Enter a name:");
            String names = scn.nextLine();
            if (names.equalsIgnoreCase("Quit")) {
                System.out.println("Quit");
                break;
            }
            if (!combineNames.isBlank()) {
                combineNames += " ";
            }
            combineNames += names;
            System.out.println(combineNames);
        }
        scn.close();
    }
}
