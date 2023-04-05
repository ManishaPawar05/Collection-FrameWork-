package collectionP;
import java.util.HashSet;
public class CompareTwoSetsRetainElementWhichAreSameInBothset {
	public static void main(String[] args) {
			HashSet<String> set1 = new HashSet<String>();
			  set1.add("Red");
	          set1.add("Green");
	          set1.add("Black");
	          set1.add("White");
	          HashSet<String> set2 = new HashSet<String>();
	          set2.add("Red");
	          set2.add("Pink");
	          set2.add("Black");
	          set2.add("Orange");
	          
			myCode(set1,set2);
		}
		//EndOfMainMethod

	public static void myCode(HashSet<String> set1,HashSet<String> set2) 
	{
		
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
