package Day_5;
class Movie{
	void genre() {
		System.out.println("Crime & Thriller");
	}
}
class Hit extends Movie{
	void name1() {
		System.out.println("Nani");
	}
}
class TrueDetective extends Movie{
	void name2() {
		System.out.println("Great");
	}
}
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hit h=new Hit();
		TrueDetective td=new TrueDetective();
		h.name1();
		h.genre();
		td.name2();
		td.genre();
	}

}