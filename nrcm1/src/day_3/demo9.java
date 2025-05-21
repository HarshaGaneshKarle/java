package day_3;
abstract class test2{
	abstract void add();
	abstract void sum();
	abstract void display();
	
}
class demo9 extends test2{
	public void add() {
		System.out.println("hi");
	}
	public void sum() {
		System.out.println("hello");
}
	public void display() {
		System.out.println("Java is better");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo9 d=new demo9();
		d.add();
		d.sum();
		d.display();
		

	}

}
