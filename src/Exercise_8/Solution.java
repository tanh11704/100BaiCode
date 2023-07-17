package Exercise_8;


public class Solution {
	public static String toGoatLatin(String sentence) {

		String[] arr = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];
			if (string.charAt(0) == 'a' || string.charAt(0) == 'A' || string.charAt(0) == 'i' || string.charAt(0) == 'I'
					|| string.charAt(0) == 'e' || string.charAt(0) == 'E' || string.charAt(0) == 'o'
					|| string.charAt(0) == 'O' || string.charAt(0) == 'u' || string.charAt(0) == 'U') {
			} else {
				string += string.charAt(0);
				string = string.substring(1);
			}
			
			string += "ma";
			
			for (int j = 0; j <= i; j++) {
				string += "a";
			}
			
			arr[i] = string;
		}

		return String.join(" ", arr);
	}

	public static void main(String[] args) {
		System.out.println(toGoatLatin("I speak Goat Latin"));
	}
}
