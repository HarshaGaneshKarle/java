package nrcm1;

public class CDC {
	static int x=70,y=60;
	int a=80,b=90;
	void ins() {
		System.out.println((a>b)&&(a<b));
	}
	void loc() {
		int p=40,q=70;
		System.out.println(!(p<q));
	}
	
public static void main(String args[]) {
	CDC A=new CDC();
	A.ins();
	A.loc();
	System.out.println(CDC.x<CDC.y||CDC.x>CDC.y);
	
	
}
}
