package collectionP;

import java.util.HashMap;
import java.util.Map.Entry;

public class SpecifiedValueWithSpecifiedKeyInTreeMap {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "xyz");
		map.put(4, "White");
		map.put(5, "abc");
		myCode(map);
	}
	//EndOfMainMethod
	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
		for(Entry<Integer, String> x:map.entrySet())
		System.out.println(x.getKey()+" "+x.getValue());
	}
}

