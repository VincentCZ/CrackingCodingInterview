package Matrix;

public class Matrix {
	public static void print(int[][] matrix) {	
		/* int a[][] = new int[3][];
		 * a[0]=new int[2];
		 * a[1]=new int[3];
		 * a[2]=new int[4];
		 * int a[][] = new int[3][5];
		 */
		for(int line = 0; line < matrix.length; line++) {
			for(int column = 0; column < matrix[0].length; ++column) {
				System.out.print(String.format("%4s", matrix[line][column]));
			}
			System.out.println();
		}
		System.out.println("");
	}
}
