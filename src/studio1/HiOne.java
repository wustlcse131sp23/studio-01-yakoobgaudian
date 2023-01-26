package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Hi. what is your name? ");
		String name = in.nextLine();
		System.out.print("Hi "+ name + "!");
		System.out.print(" How are you?");
		String you = in.nextLine();
		
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//

	}

}
