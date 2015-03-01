package Chapter1;

public class Codes1_6 {
	/*
	 * 	1.6	Given an image represented by an NxN matrix, where each
	 * 		pixel in the image is 4 bytes, write a method to rotate
	 * 		the image by 90 degrees. Can you do this in place?
	 */
	
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
	
}
