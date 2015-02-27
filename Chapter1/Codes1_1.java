package Chapter1;

public class Codes1_1 {
	/*
	 * 	1.1	Implement an algorithm to determine if a string has all unique
	 * 		characters. What if you cannot use additional data structures?
	 */
	public static boolean isUniqueChars2(String str) {
		if (str.length() > 256) return false;
		
		boolean char_set[]=new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val=str.charAt(i);
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
}
