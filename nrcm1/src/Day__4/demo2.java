package Day__4;

public class demo2 {
	private String firstName;
	private String lastName;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public static void main(String[] args) {
		demo2 m=new demo2();
		m.setFirstName("Ram");
		m.setLastName("Lakshman");
		System.out.println(m.getFirstName());
		System.out.println(m.getLastName());
	}

}
