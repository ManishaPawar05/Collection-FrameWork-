package collectionP;
import java.util.HashSet;
public class AddAllElementOfSpecifiedTreeSetToAnotherTreeSet {
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Pink");
		set.add("White");
		set.add("Black");
		HashSet<String> newSet = new HashSet<String>();
		myCode(set,newSet);
	}
	//EndOfMainMethod
	public static void myCode(HashSet<String> set,HashSet<String> newSet) 
	{
		//write code here
		HashSet<String> set1=new HashSet<String>();
		set1.addAll(set);
		System.out.println(set1);
	}
}
