package java_project;

public class Homework_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       // week();
		          month();	
	}
	public static void week()
	{
        String week[]=new String[2];
		week[0]="saturday";
		week[1]="sunday";
		
		System.out.println(week[1]);
		}
	public static void month()	{		
		String month [][]= new String [3] [3];
		//first row
		month [0] [0] ="january";
		month [0] [1] ="february";
		month [0] [2] ="march";
			//Second row		
		month [1] [0] ="april";
		month [1] [1] ="may";
		month [1] [2] ="june";
			// Third row
		month [2] [0] ="july";
		month [2] [1] ="august";
		month [2] [2] ="september";


		System.out.println(month[2][0]);
	    System.out.println(month[1][2]);




		
	}	
	}
