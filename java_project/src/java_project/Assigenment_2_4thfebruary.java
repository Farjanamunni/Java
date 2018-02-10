package java_project;
import java.util.Scanner;
public class Assigenment_2_4thfebruary {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=1;
	    Scanner reader=new Scanner(System.in);
	    int tax=4;
		switch (i)  {
		
		    case  1:	
		    	System.out.println("enter the  product name");
			    String product_details=reader.next();
		    	
		    	
		    	System.out.println("enter the first product price");
		    int price_amount=reader.nextInt();
			
		   // System.out.println("enter the  product name");
		    //String product_details=x.next();
			
			int total_price=price_amount+tax;
			
			System.out.println("enter product price again for total?");
			int Tax= reader.nextInt();
			System.out.println("Aftertax product price     is  "+     total_price);
			
			System.out.println("enter the  product ID number");
			int product_IDt=reader.nextInt();
			
			if (total_price>price_amount)
			{System.out.println("price is ok");}
			break;
		    case  2:
		   
		    if(tax<4)
		    System.out.println("amount is wrong");
		    else	
			System.out.println(" After tax total price is ok" );
			
			break;
		    case  3:
			if (tax>4)
		
			System.out.println("continue the process again");
		 break;
		 default:
		 {System.out.println("I don't know how it is work");}
		}
		}
		catch(Exception e) {System.out.println("Don't put any string value in ID number ");}
		finally {
			System.out.println("Thanks for shopping");	}
		}
	}
	

