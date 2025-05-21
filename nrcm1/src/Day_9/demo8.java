package Day_9;

import java.util.*;
public class demo8 {
public static void main(String[] args) {

	LinkedList<Object> l1=new LinkedList<Object>();
	l1.add(67);
	l1.add(56);
	l1.add(45);
	System.out.println(l1);
	l1.addFirst(70);
	l1.add(3,89);
	
	System.out.println(l1);
	l1.removeFirst();
	l1.removeLast();
	l1.removeFirstOccurrence(56);
	System.out.println(l1.removeFirstOccurrence(l1));

}
}
