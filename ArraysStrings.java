
import Substring.*;

public class ArraysStrings {
	
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
	
	public static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}	
	
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j< matrix[0].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return Substring.isSubstring(s1s1,s2);
		}
		return false;
	}
	
}
