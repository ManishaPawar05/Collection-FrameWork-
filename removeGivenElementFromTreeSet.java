package collectionP;

import java.util.TreeSet;

public class removeGivenElementFromTreeSet {
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(8);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(8);
		int ele=8;
		myCode(set,ele);
	}
	//EndOfMainMethod
	public static void myCode(TreeSet<Integer> set,int ele) 
	{
		//write code here
		System.out.println(set);
		set.remove(ele);
		System.out.println(set);
	}
}
