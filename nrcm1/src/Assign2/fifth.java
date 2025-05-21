package Assign2;

public class fifth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n =args[0];
		try {
			if ((n.equals("printer1"))||(n.equals("printer3"))){
				System.out.println("Available");
			}
			else {
				System.out.println("Device failure:not available");		
			}
		}
		finally {
			System.out.println(" ");
		}
		
			
		
		

	}

}