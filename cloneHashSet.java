package collectionP;
import java.util.HashSet;
public class cloneHashSet {
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		HashSet<Integer> hs2=new HashSet<Integer>();
		System.out.println(hs);
		myCode(hs,hs2);
	}
	//EndOfMainMethod
	@SuppressWarnings("unchecked")
	public static void myCode(HashSet<Integer> hs,HashSet<Integer> hs2) 
	{
		//write code here
		HashSet<Integer> hs1=(HashSet<Integer>)hs.clone();
		System.out.println(hs1);
	}
}
