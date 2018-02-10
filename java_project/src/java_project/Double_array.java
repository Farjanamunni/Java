package java_project;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     //r   //c
		
		
String Destination [][]= new String [4] [4];
		//first row
Destination [0] [0] ="Arizona";
Destination [0] [1] ="California";
Destination [0] [2] ="Honolulu";
Destination [0] [3] ="Miami";		
		
//Second row		
Destination [1] [0] ="s";
Destination [1] [1] ="Tg";
Destination [1] [2] ="f";
Destination [1] [3] ="j";				
		
// Third row
Destination [2] [0] ="Nebraska";
Destination [2] [1] ="Texas";
Destination [2] [2] ="Oklahoma";
Destination [2] [3] ="New Mexico";	
//Fourth row
Destination [3] [0] ="w";
Destination [3] [1] ="s";
Destination [3] [2] ="O";
Destination [3] [3] ="I";	

//System.out.println(Destination[2][0]);
//System.out.println(Destination[3][2]);




int rows= Destination.length;
int cols= Destination[0].length;
for(int rownum=0;rownum<rows; rownum++) {
for(int colnum=0;colnum<cols; colnum++)	{
		
	System.out.println(Destination[rownum][colnum]);	
	}
	
}



		
		
	}

}
 