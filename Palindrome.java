package week1_day5;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */

		String original, reverse = ""; // Objects of String class
		original = "56R6";
		int length = original.length();
		for (int i = original.length() - 1; i >= 0; i--) {
			// System.out.println(original.charAt(i));
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		if (original.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not");
		}

	}

}
