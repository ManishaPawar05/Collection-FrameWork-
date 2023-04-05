package collectionP;

import java.util.TreeSet;

public class retriveAndRemoveFirstEle {
		public static void main(String[] args) 
		{
			TreeSet<Integer> set = new TreeSet<Integer>();
			  set.add(28);
	          set.add(2);
	          set.add(1);
	          set.add(84);
	          set.add(68);
			myCode(set);
		}
		//EndOfMainMethod

	public static void myCode(TreeSet<Integer> set) 
	{
		//write code here
		System.out.println(set);
		System.out.println("Remove element : "+set.pollFirst());
	}
}
