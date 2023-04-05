package collectionP;
import java.util.*;
public class getTheFirstLowestKeyAndLastHighestKeyInMAp {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(22, "twotwo");
		hm.put(43, "fourtyThree");
		hm.put(1, "one");
		hm.put(9, "nine");
		hm.put(5, "five");
		myCode(hm);
	}
	//EndOfMainMethod

	private static void myCode(HashMap<Integer, String> hm) 
	{
		//TreeSet<Integer, String> ts=new TreeSet<Integer, String>();
//		String set=hm.get(hm.keySet().toArray()[0]);
//		String set1=hm.get(hm.keySet().toArray()[hm.size()-1]);
//		System.out.println(set);
//		System.out.println(set1);
		System.out.println(hm.keySet().toArray()[0]);
		System.out.println(hm.keySet().toArray()[hm.size()-1]);
		
	}
}
