package collectionP;

import java.util.TreeSet;

public class cloneTreeSetListToAnotherList {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
			  set.add(8);
	          set.add(62);
	          set.add(12);
	          set.add(4);
	          set.add(6);
	          
	        TreeSet<Integer> ts=new TreeSet<Integer>();  
			myCode(set,ts);
		}
		//EndOfMainMethod

	@SuppressWarnings("unchecked")
	public static void myCode(TreeSet<Integer> set,TreeSet<Integer> ts) 
	{
		//write code here
		System.out.println(set);
		TreeSet<Integer> set1=(TreeSet<Integer>)set.clone();
		System.out.println(set1);
		
		
	}
}