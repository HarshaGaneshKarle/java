//userdefined exception
/*package Day_7;
class MethException extends Exception{
	public MethException(String message) {
		super(message);
	}
}
public class demo5 {
	public static void kilocheck(int kilo) throws MethException{
	if(kilo<40) {
		throw new MethException("Tight tight tight...");
	}
	else {
		System.out.println("Jesse you trying to fool me");
	}
}
public static void main(String[] args) {
	try {
		kilocheck(35);
	}
	catch(MethException e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("How high can feel");
	}
		
}
}*/
package Day_7;

class evenOroddException extends Exception {
    public evenOroddException(String message) {
        super(message);
    }
}

public class demo5 {
    public static void numbercheck(int evenodd) throws evenOroddException {
        if (evenodd % 2 == 0) {
            throw new evenOroddException("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        try {
            numbercheck(35);
        } catch (evenOroddException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Congrats!");
        }
    }
}
