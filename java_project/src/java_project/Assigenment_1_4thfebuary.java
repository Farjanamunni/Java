package java_project;
import java.util.Scanner;
public class Assigenment_1_4thfebuary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    double tax_rate=4;
	    
     
	    //price of the item (input)
		
	    Scanner reader=new Scanner(System.in);
		
	    System.out.println("what is the product price?");
		int price_amount=reader.nextInt();
		System.out.println("product price is " + price_amount );
		
		
		System.out.println("product details : name and colour");
		String product_details=reader.next();
		System.out.println("product  name is "+product_details  );
		
		double tax=price_amount+tax_rate;
		
		System.out.println("Enter product price again for total price");
		int Tax= reader.nextInt();
		System.out.println("Aftertax product price     is  "+     tax);
		
		System.out.println("what is your product ID number");
	    int product_ID= reader.nextInt();
		System.out.println("product ID number is "+ product_ID );
		}
		catch(Exception e) {System.out.println("Don't put any string value in ID number ");
		}
		finally {
			System.out.println("Thanks for shopping");
		}
		}
		
	}
	
	

