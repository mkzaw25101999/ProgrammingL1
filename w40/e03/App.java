package e03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scn.next();

        if (name.equalsIgnoreCase(name)) {
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.println(name.charAt(i));
            }
        }
        scn.close();
    }
}
