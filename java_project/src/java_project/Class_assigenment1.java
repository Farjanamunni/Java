package java_project;
import java.util.Scanner;
public class Class_assigenment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("what is your name");
		String name= reader.next();
		System.out.println("my name is "+name );
		
		System.out.println("my age");
		int age=reader.nextInt();
		System.out.println("my age is "+age );
		
		System.out.println("what is your address");
		String address= reader.next();
		System.out.println("my address is "+ address );
		
		
		System.out.println("what is your zipcoad");
		String zipcoad= reader.next();
		System.out.println("my zipcoad is "+ zipcoad );
		
		System.out.println("what is your state");
		String state= reader.next();
		System.out.println("my zipcoad is "+ state );
		
		
		System.out.println("what is your salary");
		String salary= reader.next();
		System.out.println("my zipcoad is "+ salary );
		
		System.out.println("what is your city");
		String city= reader.next();
		System.out.println("my city is "+ city );
		}
		
		catch(Exception e) {System.out.println(" dont put any tring value in age and dont put any intiger vlue in name");
		}
		
		
		finally {
			System.out.println("Thanks for providing your information");
		}
		
		
		
		
		
		}
		
	}


