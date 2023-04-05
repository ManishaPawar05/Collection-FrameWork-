package collectionP;
import java.util.*;
public class IterateThroughAllElementInLinkedListStartingAtSpecifiedosition {
	public static void main(String[] args) 
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		int pos=1;
		myCode(list1,pos);
	}
	//EndOfMainMethod
	public static void myCode(LinkedList<Integer> list1,int pos) 
	{
		//write code here
		Iterator it=list1.listIterator(pos);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		list1.remove(pos);
		//System.out.println(list1);
	}
}

