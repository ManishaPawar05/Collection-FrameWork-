package collectionP;
import java.util.*;
public class cloneArrayListToAnotherArrayList {
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		myCode(list1,list2);
	}
	//EndOfMainMethod
	@SuppressWarnings("unchecked")
	public static void myCode(ArrayList<Integer> list1,ArrayList<Integer> list2) 
	{
		//write code here
		ArrayList<Integer> al=(ArrayList<Integer>)list1.clone();
		System.out.println(al);
	}
}
