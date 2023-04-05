package collectionP;
import java.util.ArrayList;
import java.util.List;
public class insertElementArrayListAtFirstPosition {
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("x");
		List1.add("y");
		List1.add("u");
		List1.add("a");
		int index=2;
		String s="hi";
		myCode(List1,index,s);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1,int index,String s) 
	{
		//write code here
		list1.add(index,s);
		System.out.println(list1);
	}
}
