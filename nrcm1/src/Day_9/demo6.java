package Day_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class demo6 {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(87);
		System.out.println(l1);
		List<Object> extra=Arrays.asList(9,8,0);
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
			for(Object a1:arr) {
				System.out.println(a1);
			}
		}
	}