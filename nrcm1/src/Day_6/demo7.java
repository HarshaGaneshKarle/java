package Day_6;

class demo100{
	private static void show() {
		System.out.println("hi");
	}
	static class test3{
		static void print() {
			System.out.println("Hello");
			show();
		}
	}
	}
	public class demo7{
		public static void main(String[] args) {
			demo100.test3.print();
		}
}
