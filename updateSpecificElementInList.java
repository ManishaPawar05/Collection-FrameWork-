package collectionP;
import java.util.ArrayList;
import java.util.List;
public class updateSpecificElementInList {
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("x");
		List1.add("y");
		List1.add("u");
		List1.add("a");
		int ele=3;
		String s="hi";
		myCode(List1,ele,s);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1,int ele,String s) 
	{
		//write code here
		list1.set(ele, s);
		System.out.println(list1);
	}
}
