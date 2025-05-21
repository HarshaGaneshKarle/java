package Day__4;

public class thispurpose {
	int a=8+7;
	public void add() {
		System.out.println("addition is:");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thispurpose tp=new thispurpose();
		tp.sub();

	}

}
