package java_codes;

public class CharOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome to Chennai";
		int count = 0;

		// Method 1:
		/*
		 * for (int i = 0; i < input.length(); i++) { if (input.charAt(i) == 'e') {
		 * count++; }
		 * 
		 * } System.out.println(count);
		 */

		// Method 2:
		String newS = input.replace("e", ""); // to replace old character with new character
		//System.out.println(newS);
		int length = input.length();
		int length2 = newS.length();
		System.out.println(length - length2);

	}

}
