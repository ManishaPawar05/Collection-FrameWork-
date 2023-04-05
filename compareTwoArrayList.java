package collectionP;
import java.util.ArrayList;
public class compareTwoArrayList {
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(4);
		list2.add(6);
		list2.add(12);
		list2.add(9);
		list2.add(7);
		myCode(list1,list2);
	}
	//EndOfMainMethod
	public static void myCode(ArrayList<Integer> list1,ArrayList<Integer> list2) 
	{
		//write code here
		//ArrayList<Integer> list3=new ArrayList<Integer>();
		
		System.out.println(list1.equals(list2));
	}
}
