package collectionP;
import java.util.HashSet;
import java.util.Iterator;
public class IterateAllElementInHashList {
		public static void main(String[] args) 
		{
			HashSet<String> set = new HashSet<String>();
			  set.add("Red");
	          set.add("Green");
	          set.add("Black");
	          set.add("White");
	          set.add("Pink");
	          set.add("Yellow");
	          
			myCode(set);
		}
		//EndOfMainMethod

	public static void myCode(HashSet<String> set) 
	{
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
