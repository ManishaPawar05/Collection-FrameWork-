package collectionP;
import java.util.Iterator;
import java.util.LinkedList;
public class iterateAllEleInLinkedList {
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
		Iterator<Integer> it=list1.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
