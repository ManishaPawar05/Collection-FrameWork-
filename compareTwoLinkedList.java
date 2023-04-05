package collectionP;

import java.util.LinkedList;

public class compareTwoLinkedList {
		public static void main(String[] args) 
		{
			LinkedList<String> c1= new LinkedList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");

	          LinkedList<String> c2= new LinkedList<String>();
	          c2.add("Red");
	          c2.add("Green");
	          c2.add("Black");
	          c2.add("Orange");

			myCode(c1,c2);
		}
		//EndOfMainMethod

	public static void myCode(LinkedList<String> c1,LinkedList<String> c2) 
	{
		//write code here
		 LinkedList<String> c3= new LinkedList<String>();
		 for(String s:c1)
		 c3.add(c2.contains(s)?"yes":"No");
		 System.out.println(c3);
		 
	}
}
