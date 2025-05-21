package Day_9;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;
public class demo11 {
public static void main(String[] args) {

	Vector<Integer> l1=new Vector<Integer>();
	l1.add(67);
	l1.add(56);
	l1.add(45);
	System.out.println(l1);
	Enumeration i1=l1.elements();
	while (i1.hasMoreElements()) {
		System.out.println(i1.nextElement());
	}
}
}