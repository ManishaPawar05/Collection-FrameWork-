package collectionP;

import java.util.LinkedList;

public class cloneLinkedListtoAntherList {
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		LinkedList<Integer> list3=new LinkedList<Integer>();
		myCode(list1,list3);
	}
	//EndOfMainMethod
	@SuppressWarnings("unchecked")
	public static void myCode(LinkedList<Integer> list1,LinkedList<Integer> list3) 
	{
		//write code here
		LinkedList<Integer> list2=(LinkedList<Integer>)list1.clone();
		System.out.println(list2);
	}
}
