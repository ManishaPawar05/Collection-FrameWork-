package collectionP;

import java.util.HashMap;
import java.util.Set;

public class setTheViewOfKeyMap {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(33, "Black");
		map.put(40, "White");
		map.put(51, "Blue");
		myCode(map);
	}
	//EndOfMainMethod
	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
		Set keyset=map.keySet();
		System.out.print(keyset);
	}
}



