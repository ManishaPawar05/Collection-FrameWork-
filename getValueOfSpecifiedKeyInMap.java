package collectionP;
import java.util.*;
public class getValueOfSpecifiedKeyInMap {
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(22, "twotwo");
		tm.put(43, "fourtyThree");
		tm.put(1, "one");
		tm.put(9, "nine");
		tm.put(5, "five");
		int key=9;
		myCode(tm,key);
	}
	//EndOfMainMethod
	private static void myCode(TreeMap<Integer, String> tm,int key) 
	{
		//write code here
		String val=(String)tm.get(key);
		System.out.println(val);
		System.out.println(tm.get(key));
	}
}
