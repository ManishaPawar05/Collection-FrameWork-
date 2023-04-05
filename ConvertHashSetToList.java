package collectionP;
import java.util.ArrayList;
import java.util.TreeSet;
public class ConvertHashSetToList {
	public static void main(String[] args) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(8);
		set.add(32);
		set.add(12);
		set.add(34);
		set.add(81);
		ArrayList<Integer> al=new ArrayList<Integer>();
		myCode(set,al);
	}
	//EndOfMainMethod
	public static void myCode(TreeSet<Integer> set,ArrayList<Integer> al) 
	{
		//write code here
		ArrayList<Integer> al1=new ArrayList<Integer>(set);
		System.out.println(al1);
	}
}
