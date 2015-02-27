package Chapter1;

public class Codes1_4 {
	/*
	 * 	1.4	Write a method to replace all spaces in a string
	 * 		with '%20'. You may assume that the string has
	 * 		sufficient space at the end of the string to hold
	 * 		the additional characters, and that you are given
	 * 		the "true" length of the string. (Note: if
	 * 		implementing in Java, please use a character array
	 * 		so that you can perform this operation in place.)
	 */
	public static String replaceSpaces(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				builder = builder.append("%20");
			} else
			builder = builder.append(str.charAt(i));
		}
		return builder.toString();
	}
	
}
