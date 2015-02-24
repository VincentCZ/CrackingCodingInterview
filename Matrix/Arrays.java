package Matrix;

import java.util.Random;

public class Arrays {
	
	public static int[] random(int[] arrays) {
		Random r = new Random();
		for(int i = 0; i < arrays.length; i++) {
			arrays[i] = r.nextInt(); 
		}
		return arrays;
	}
	
	public static int[] random(int[] arrays, int maxValue) {
		Random r = new Random();
		for(int i = 0; i < arrays.length; i++) {
			arrays[i] = r.nextInt(maxValue); 
		}
		return arrays;
	}	
}
