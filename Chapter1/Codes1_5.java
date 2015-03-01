package Chapter1;

public class Codes1_5 {
	/*
	 * 	1.5	Implement a method to perform basic string compression
	 * 		using the counts of repeated characters. For example,
	 * 		the string aabcccccaaa would become a2b1c5a3. If the
	 * 		"compressed" string would not become smaller than the
	 * 		original string, your method should return the original
	 * 		string.
	 */
	
	public static String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count ++;
			} else {
				mystr += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}			
		}
		return mystr + last + count;
	}
	
	public static String compressBetter(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}
	
	public static String compressAlternate(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}
		
		char[] array = new char[size];
		int index = 0;
		char last = str.charAt(0);
		int count = 1;
		for (int i =1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				index =setChar(array, last, index, count);
				last = str.charAt(i);
				count = 1;
			}
		}
		index = setChar(array, last, index, count);
		return String.valueOf(array);
	}
	
	public static int setChar(char[] array, char c, int index, int count) {
		array[index] = c;
		index++;
		
		char[] cnt = String.valueOf(count).toCharArray();
		for (char x : cnt) {
			array[index] = x;
			index++;
		}
		
		return index;
	}

	public static int countCompression(String str) {
		if (str == null || str.isEmpty()) return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count ++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		
		size += 1 + String.valueOf(count).length();
		return size;
	}
	
}
