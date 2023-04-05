package collectionP;

import java.util.LinkedList;

public class getFirstAndLastOccuranceOfLinkedList {
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		myCode(list1);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1) 
	{
		//write code here
		System.out.println("first :"+list1.getFirst());
		System.out.println("last: "+list1.getLast());
	}
}
