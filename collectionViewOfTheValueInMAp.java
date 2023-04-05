package collectionP;
import java.util.HashMap;
import java.util.Map.Entry;
public class collectionViewOfTheValueInMAp {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap <Integer,String> ();
		map.put(1, "Red");
		map.put(2, "Green");
		map.put(3, "Black");
		map.put(4, "White");
		map.put(5, "Blue");
		myCode(map);
	}
	//EndOfMainMethod
	public static void myCode(HashMap<Integer,String> map) 
	{
		//write code here
		System.out.print(map.values());
	}
}
