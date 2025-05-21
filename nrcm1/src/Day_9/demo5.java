package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class demo5 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(87);
		System.out.println(l1);
		List<Object> extra=Arrays.asList("Enkky","Pinky","Ponky");
		l1.addAll(1,extra);
		System.out.println(l1);
		}
}