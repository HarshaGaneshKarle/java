package Day_9;

import java.util.*;
public class demo7 {
public static void main(String[] args) {
	/*int[] arr1= {67,87,89,87,56,98};
	Arrays.sort(arr1);
	int a=Arrays.binarySearch(arr1, 90);
	System.out.println(a);
	for(int b1:arr1)
		System.out.println(b1);
	System.out.println();
*/
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
	

}
}

