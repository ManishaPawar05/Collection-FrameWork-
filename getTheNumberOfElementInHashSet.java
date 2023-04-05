package collectionP;
import java.util.HashSet;
public class getTheNumberOfElementInHashSet {
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
		System.out.println(set.size());
	}
}
