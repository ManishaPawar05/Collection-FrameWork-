package collectionP;

import java.util.*;

public class CopyOneListToAnother {
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		myCode(List1,List2);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1,List<String> list2) 
	{
		//write code here
		List<String> list3=new ArrayList<String>();
		list3.addAll(list2);
		System.out.println("List1: "+list3);
		System.out.println("list2: "+list2);
	}
}
