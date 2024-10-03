package e01;

import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(final String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scn.next();

        if (name.equalsIgnoreCase("Louis")) {
            System.out.println("Are you French?");

        }
        else{
            System.out.println("You have a great name!");

        }
        scn.close();

    }
}