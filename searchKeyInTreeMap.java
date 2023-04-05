package collectionP;
import java.util.*;
public class searchKeyInTreeMap {
	//private static Set<Entry<Integer, String>> entrySet;
		//StartOfMainMethod
		public static void main(String[] args) 
		{
	
			TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
			  map.put(19, "Red");
			  map.put(2, "Green");
			  map.put(13, "tyu");
			  map.put(4, "White");
			  map.put(57, "sks");
		
			 int key=3; 
			myCode(map,key);
		}
		//EndOfMainMethod

	public static void myCode(TreeMap<Integer,String> map,int key) 
	{
		//write code here
		
		if(map.containsKey(key))
		{
			System.out.println("tree map contins key");
		}
		else
		{
			System.out.println("tree map does not contains key");
		}
	}
}

