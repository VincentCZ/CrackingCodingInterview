package Substring;

public class Substring {
	
	public static boolean isSubstring(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(count)) {
				++count;
			} else {
				count = 0;
			}
			if (count == s2.length()) return true;
			//if (count == s2.length()) return i-length+1;
		}
		return false;
		//return -1;
	}
	
	public static boolean isSubstring2(String s1, String s2) {
		return s1.indexOf(s2) > -1;
	}
}
