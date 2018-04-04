package strings;

public class Question11 {

		public static void main(String[] args) {
			String myStr = "good";
			char[] myCharArr = { 'g', 'o', 'o', 'd' };

			String newStr = null;
			for (char ch : myCharArr) {
				newStr = newStr + ch;
			}

			System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));

		}
	}

	// What will it print when compiled and run?
