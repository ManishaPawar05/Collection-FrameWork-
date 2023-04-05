package collectionP;
import java.util.HashSet;
public class removeAllElementFromSet {
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		myCode(set);
	}
	//EndOfMainMethod
	public static void myCode(HashSet<String> set) 
	{
		//write code here
		set.clear();
		System.out.println(set);
	}
}
