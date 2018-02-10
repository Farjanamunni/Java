package java_project;

public class Employee_double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Employee [][]= new String [4] [4];
		//first row
		Employee [0] [0] ="Jhon";
		Employee [0] [1] ="Bread";
		Employee [0] [2] ="Crish";
		Employee [0] [3] ="Drue";		
		//Second row		
		Employee [1] [0] ="Stefen";
		Employee [1] [1] ="Lin";
		Employee [1] [2] ="Mishel";
		Employee [1] [3] ="Nicola";				
		// Third row
		Employee [2] [0] ="Jess";
		Employee [2] [1] ="Juss";
		Employee [2] [2] ="Blenge";
		Employee [2] [3] ="New Haven";	
		//Fourth row
		Employee [3] [0] ="Sharron";
		Employee [3] [1] ="Jhafi";
		Employee [3] [2] ="Christina";
		Employee [3] [3] ="Deav";	
//System.out.println(Destination[3][0]);

int rows= Employee.length;
int cols= Employee[0].length;

for(int rownum=0;rownum<rows; rownum++) {
for(int colnum=0;colnum<cols; colnum++)	{
System.out.println(Employee[rownum][colnum]);	
	}
	
}
	
	}

}
