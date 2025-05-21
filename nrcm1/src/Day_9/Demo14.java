/**
 * 
 */
package Day_9;
import java.util.*;
public class Demo14 {

	public static void main(String[] args) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(1, "Deepu");
		m1.put(2, "Roy");
		m1.put(4, "Dev");
		m1.put(7, "Mahi");
		m1.put(5, "Jay");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}

	}

}
