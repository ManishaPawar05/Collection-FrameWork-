package collectionP;
import java.util.*;
public class frequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbccdd";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				int value=map.get(s.charAt(i));
						map.put(s.charAt(i), ++value);
				
			}
			else
				map.put(s.charAt(i), 1);
		}
		System.out.println(map);
	}

}
