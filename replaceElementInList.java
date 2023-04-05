package collectionP;

import java.util.LinkedList;

public class replaceElementInList {
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(42);
		list1.add(16);
		list1.add(33);
		list1.add(94);
		list1.add(87);
		int index=2;
		int ele=100;
		myCode(list1,ele,index);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int ele,int index) 
	{
		//write code here

		System.out.println(list1);
		list1.set(index, ele);
		System.out.println(list1);
	}
}
