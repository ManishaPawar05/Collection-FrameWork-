package collectionP;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class reverseElementInTreeSet {
		public static void main(String[] args) 
		{
			TreeSet<Integer> set = new TreeSet<Integer>();
			  set.add(3);
	          set.add(6);
	          set.add(8);
	          set.add(4);
	          set.add(1);
	          
			myCode(set);
		}
		//EndOfMainMethod

	public static void myCode(TreeSet<Integer> set) 
	{
		//write code here
		Iterator it=set.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
