package collectionP;

import java.util.TreeMap;

public class gretestKeyLessThanOrEqualToGivenKe {
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
		map.put(9, "Red");
		map.put(2, "Green");
		map.put(1, "tyu");
		map.put(4, "White");
		map.put(5, "sks");
		int key=3;
		myCode(map,key);
	}
	//EndOfMainMethod
	public static void myCode(TreeMap<Integer,String> map,int key) 
	{
		//write code here
		System.out.println(map.floorEntry(key));
	}
}
