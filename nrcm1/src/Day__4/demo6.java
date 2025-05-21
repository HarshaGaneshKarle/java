package Day__4;

public class demo6 {
	int x;
	int y;
	public demo6(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public demo6(demo6 d6) {
		this.x=d6.x;
		this.y=d6.y;
		System.out.println(x-y);
	}
	

	public static void main(String[] args) {
		demo6 d6=new demo6(65,80);
		demo6 d0=new demo6(d6);
	}

}
