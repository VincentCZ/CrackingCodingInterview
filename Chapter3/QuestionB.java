package Chapter3;

public class QuestionB {
	static int number_of_stacks = 3;
	static int default_size = 4;
	static int total_size = default_size * number_of_stacks;
	static StackData[] stacks = {new StackData(0, default_size),
		new StackData(default_size, default_size),
		new StackData(default_size * 2, default_size)};
	static int[] buffer = new int [total_size];
	
//	public static void main(String [] args) throws Exception {
//		push(0,10);
//		push(1,20);
//	
//	}
}
