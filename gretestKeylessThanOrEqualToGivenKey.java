package collectionP;
import java.security.KeyStore.Entry;
import java.util.*;
public class gretestKeylessThanOrEqualToGivenKey{

	//private static Set<Entry<Integer, String>> entrySet;
		//StartOfMainMethod
		public static void main(String[] args) 
		{
	
			TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
			  map.put(9, "Red");
			  map.put(23, "Green");
			  map.put(15, "tyu");
			  map.put(4, "White");
			  map.put(51, "sks");
		
			  int key=17;
			myCode(map,key);
		}
		//EndOfMainMethod

	public static void myCode(TreeMap<Integer,String> map,int key) 
	{
		//write code here
		
		System.out.println(map.floorKey(key));
		
	}
}

