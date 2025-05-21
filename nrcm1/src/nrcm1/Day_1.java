package nrcm1;

public class Day_1 {
	static float pi=3.14f;
	static int r=7;
	void circle() {
		System.out.println(pi*r*r);
	}
	static int l=30,b=8;
	static void rec() {
		System.out.println(l*b);
	}
	int a=8;
	void square() {
		System.out.println(a*a);
	}
	static void tri() {
		int h=4,b=9;
		System.out.println(0.5*b*h);
	}
	public static void main(String args[]) {
		Day_1 A=new Day_1();
		A.circle();
		A.rec();
		A.square();
		A.tri();
	}

}
