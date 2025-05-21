package Day__4;

public class demo3 {
	private String firstName;
	private String lastName;
	private Long phNumber;
	private String eMail;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setphNumber(Long ph) {
		 phNumber=ph;
	}
	public void seteMail(String em) {
		eMail=em;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Long getphNumber() {
		return phNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public static void main(String[] args) {
		demo3 m=new demo3();
		m.setFirstName("Ram");
		m.setLastName("Lakshman");
		m.setphNumber(8121275336l);
		m.seteMail("RamLakshman@gmail.com");
		System.out.println(m.getFirstName());
		System.out.println(m.getLastName());
		System.out.println(m.getphNumber());
		System.out.println(m.geteMail());
	}

}
