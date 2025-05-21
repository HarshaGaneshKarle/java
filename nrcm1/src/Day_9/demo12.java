package Day_9;

import java.util.*;
public class demo12 {
public static void main(String[] args) {

	Queue<Integer> l1=new PriorityQueue<Integer>();
	l1.add(67);
	l1.offer(56);
	l1.offer(45);
	System.out.println(l1);
	l1.poll();
	System.out.println(l1);
	l1.remove();
	System.out.println(l1);
}
}