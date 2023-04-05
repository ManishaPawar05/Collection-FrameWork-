package collectionP;
import java.util.HashSet;
public class AppendTheSpecifiedElementToTheEndToHashSet {
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		String name="blue";
		myCode(set,name);
	}
	//EndOfMainMethod
	public static void myCode(HashSet<String> set,String name) 
	{
		//write code here
		set.add(name);
		System.out.println(set);
	}
}
