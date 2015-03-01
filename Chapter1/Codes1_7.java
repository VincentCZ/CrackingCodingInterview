package Chapter1;

import Substring.Substring;

public class Codes1_7 {
	/*	
	 * 	1.7	Write an algorithm such that if an element in an 
	 * 		MxN matrix is 0, its entire row and column are
	 * 		set to 0;
	 */
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return Substring.isSubstring(s1s1,s2);
		}
		return false;
	}
}
