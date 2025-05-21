package Day_9;
import java.util.*;
public class demo2 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(32);
		l1.add(87);
		List<Integer> l2=new ArrayList<Integer>(l1);
		l2.add(23);
		l2.add(32);
		l2.add(45);
		l2.addAll(l2);
		System.out.println(l2);
	}

}
