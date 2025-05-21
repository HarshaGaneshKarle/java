package Day_9;
import java.util.*;
public class demo4 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(32);
		l1.add(87);
		List<Object> l2=new ArrayList<Object>(l1);
		l2.add(23);
		l2.add("hello");
		l2.add(45);
		l2.addAll(l2);
		Iterator i1=l2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}

