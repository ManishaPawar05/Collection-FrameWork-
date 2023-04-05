package collectionP;

import java.util.LinkedList;

public class retriveButDoesNotRemoveLastEle {
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
		int val=list1.peekLast();
		System.out.println(val);
		System.out.println(list1);
	}
}
