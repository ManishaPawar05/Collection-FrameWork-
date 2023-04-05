package collectionP;

import java.util.LinkedList;

public class removeFirstAndLastElementIinkedList {
		public static void main(String[] args) 
		{
			LinkedList<Integer> list1=new LinkedList<Integer>();
			list1.add(3);
			list1.add(9);
			list1.add(7);
			
			System.out.println(list1);
			myCode(list1);
		}
		//EndOfMainMethod

	public static void myCode(LinkedList<Integer> list1) 
	{
		//write code here
		System.out.println(list1);
		list1.removeFirst();
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
	}
}

