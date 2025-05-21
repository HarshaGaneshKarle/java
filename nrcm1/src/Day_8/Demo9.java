package Day_8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo9 {
	//public static void main(String[] args) throws IOException {
		/*File f1=new File("C:\\Users\\HARSHA\\OneDrive\\Desktop\\Sem");
		if(f1.createNewFile()) {
			System.out.println("File created Successfully");
		}else {
			System.out.println("Not Created");
		}*/
		/*FileWriter f1=new FileWriter("C:\\Users\\HARSHA\\OneDrive\\Desktop\\Sem");
		f1.write("How much do you need");
		f1.close();
		System.out.println("Success");*/
	public static void main(String[] args) {
		try {
			File Obj=new File("C:\\Users\\HARSHA\\OneDrive\\Desktop\\Sem");
			Scanner r=new Scanner(Obj);
			while(r.hasNext()){
				String data=r.nextLine();
				System.out.println(data);
			}
			r.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		}
	}
}
