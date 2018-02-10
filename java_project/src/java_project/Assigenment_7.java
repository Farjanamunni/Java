package java_project;

public class Assigenment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int week = 3;
	       
		   int numDays = 0;

	        switch (week) {
	            case 1:
	            	System.out.println("7 days");
	            	break;
	            case 2: 
	            	System.out.println("28 days");
	            	break;
	            case 4:
	            	System.out.println("14 days");
	            	break;
	           
	            case 3:
	                if (((week==3)&&(week<=4))||(week>=6))
	                	numDays = 21;
	                else
	                    numDays = 28;
	                break;
	            default:
	                System.out.println("Invalid week.");
	                break;
	        }
	        System.out.println("Number of Days = "
                    + numDays);
	}

}
