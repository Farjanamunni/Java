package java_project;

public class Homework_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //credit();
		     week();
	}
	public static void credit() {
		
		double score1 = 80;
		double score2 = 60;
		double score3 = 40;
		double average = (score1+score2+score3)/3;
			
		{	
		System.out.println("Average score "+average );
			}	
		if (score1>average)	{
			System.out.println("Credit score1 "+score1 +" is  excellent" );
		}
		else {
			System.out.println("Credit score1 "+score1 +" is  low" );
		}
		
		if (score2<average || score2==average);
		{
			System.out.println("Credit score2 "+score2 +" is  good" );	
		}
		
		if (score3<average) 
			{
				System.out.println("Credit score3 "+score3 +" is  low" );	
			}
		else
		{
			System.out.println("Credit score3 "+score3 +" is  good" );
		}
		
	    }	
		public static void week() {	
			
			 int week = 3;
		       
			 
		        switch (week) {
		            case 1:
		            	System.out.println("7 days");
		            	break;
		            case 2: 
		            	System.out.println("14 days");
		            	break;
		            case 4:
		            	System.out.println("28 days");
		            	break;
		           
		            case 3:
		                if (((week==3)&&(week<=4))||(week>=6))
		                	System.out.println("numDays = 21");
		                else
		                	System.out.println("numDays = 28");
		                break;
		            default:
		                System.out.println("Invalid week.");
		                break;
		        }
		       
					
	}	
}
