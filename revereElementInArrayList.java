package collectionP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class revereElementInArrayList {
	public static void main(String[] args) 
	{
		List<String> List1 = new ArrayList<String>();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		List1.add("D");
		myCode(List1);
	}
	//EndOfMainMethod
	public static void myCode(List<String> list1) 
	{
		Collections.reverse(list1);
		System.out.println(list1);
	}
}

