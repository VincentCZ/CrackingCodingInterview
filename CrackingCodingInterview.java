
import ChapterII.*;
import LinkedList.*;

public class CrackingCodingInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysStrings();
		LinkedLists();		
	}
	
	public static void ArraysStrings() {
		
		System.out.println("Chapter I ArraysStrings & String completed");
		
//		String str = "abcdefg";
//		System.out.println(ArraysStrings.isUniqueChars2(str));
//		
//		String s3 = "God";
//		String t3 = "dog";
//		System.out.println(ArraysStrings.permutation2(s3,t3));
//		
//		String str4 = "I's a worng code ! ! !";
//		System.out.println(ArraysStrings.replaceSpaces(str4));
//		
//		String str5 = "aaabbccddeeffaa";
//		System.out.println(ArraysStrings.compressBad(str5));
//		System.out.println(ArraysStrings.compressBetter(str5));
//		System.out.println(ArraysStrings.compressAlternate(str5));
		
//		int[][] matrix6= {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16}
//		};
//		Matrix.print(matrix6);
//		ArraysStrings.rotate(matrix6,matrix6.length);
//		Matrix.print(matrix6);
				
//		String s1 = "HelloWorldJava";
////		String s2 = "WorldJavaHello";
//		String s3 = "JavaWorldHello";
//		System.out.println(ArraysStrings.isRotation(s1, s3));
		
	}

	public static void LinkedLists() {
		
		System.out.println("Chapter II Linked Lists");
		
//		int[] c1 = {1, 2, 2, 3, 3, 4, 5, 6, 6, 3, 3};		
//		LinkedList n1 = new LinkedList(c1);
//		System.out.println(n1);
//		Codes2_1.deleteDups2(n1.head);
//		System.out.println(n1);

//		int[] c2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		LinkedList n2 = new LinkedList(c2);
//		IntWrapper i = new IntWrapper();
//		int k = 3;
//		System.out.print(Codes2_2.nthToLastR2(n2.head, k, i).data);
//		System.out.print(String.format("%8s",""));
//		System.out.println(Codes2_2.nthToLastR3(n2.head, k).data);

		/*	test type LinkedList	*/
//		int[] i3 = {10, 20, 30, 40};
//		LinkedList l3 = new LinkedList(i3);
//		Codes2_3.deleteNode(l3.head);
//		System.out.println(l3);

//		LinkedListNode n4 = LinkedList.create(Matrix.Arrays.random(new int[10],10));
//		LinkedList n4 = new LinkedList(Matrix.Arrays.random(new int[10],10));
//		System.out.println(n4);
//		LinkedList l4 = null;
//		l4.head = Codes2_4.partition(n4.head, 4);
//		System.out.println(l4);

//		LinkedList a5 = new LinkedList(Matrix.Arrays.random(new int[4],10));
//		LinkedList b5 = new LinkedList(Matrix.Arrays.random(new int[3],10));
//		LinkedList sum5 = new LinkedList();
//		sum5.head = Codes2_5.addLists2(a5.head, b5.head);
//		System.out.println(a5);
//		System.out.println(b5);
//		System.out.println(sum5);
		
		int[] i6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		LoopLinkedList lh6 = new LoopLinkedList(i6, 5);
		System.out.println(lh6.head + " -> " + "<n" + lh6.loopNode + ">" + lh6.loopHead);
		System.out.println(Codes2_6.FindBeginning(lh6.head)); 
		System.out.println(lh6);
	}
	
	
}
