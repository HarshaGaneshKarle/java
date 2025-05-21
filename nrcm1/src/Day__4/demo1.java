package Day__4;
class FixedAmount{
	public int fixedAmount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}
public class demo1 extends Withdrawal{
	FixedAmount f1= new FixedAmount();
	void withdraw(int amount) {
		f1.fixedAmount-=amount;
		System.out.println("Withdrawn:"+amount);
		System.out.println("Available Balance:"+f1.fixedAmount);
	}
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		demo1 d=new demo1();
		d.withdraw(amount);
	}
}
 	

	


