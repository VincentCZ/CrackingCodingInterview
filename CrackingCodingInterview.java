
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
//		LinkedListNode n1 = MyTools.createLinkList(c1);		
//		
//		MyTools.printLinkedList(n1);
//		LinkedList.deleteDups2(n1);
//		MyTools.printLinkedList(n1);

//		int[] c2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		LinkedListNode n2 = LinkedList.create(c2);
//		
//		IntWrapper i = new IntWrapper();
//		int k = 2;
//		System.out.print(LinkedLists.nthToLastR2(n2, k, i).object);
//		System.out.print(" ");
//		System.out.println(LinkedLists.nthToLastR3(n2, k).object);

		/*	test type LinkedList	*/
//		int[] i3 = {10, 20, 30, 40};
//		LinkedList l3 = new LinkedList(i3);
//
//		System.out.println(l3.delete(2));
//		System.out.println(l3.mid);
//		System.out.println(l3);

		LinkedListNode n4 = LinkedList.create(Matrix.Arrays.random(new int[10],10));
		LinkedList.print(n4);
		LinkedListNode l4 = LinkedLists.partition2(n4, 4);
		LinkedList.print(l4);
	}
}
