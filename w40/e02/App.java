package e02;

import java.util.Scanner;

public class App {
	public static void main(final String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a name: ");

		String name = scn.next();

		if (name.equalsIgnoreCase(name)) {
			for (char c : name.toCharArray()) {
				System.out.println(c);
			}
		}
		scn.close();
	}
}
