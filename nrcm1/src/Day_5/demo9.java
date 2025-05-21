package Day_5;
interface I11{
	void add();
}
class test{
	void sub(){
		System.out.println("hello");
	}
} 
public class demo9 extends test implements I11 {
	public void add() {
		System.out.println("okkkkk");
	}
	public void sub() {
		System.out.println("eyyyyy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo9 i=new demo9(); 
		i.add();
		i.sub();

	}

}
