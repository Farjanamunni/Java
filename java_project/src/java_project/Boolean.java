package java_project;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// boolean is an expression that return true or false
		int size = 100;
		String color= "blue";
		
//use expression to compute a boolean value
		boolean largeandblue= size>=50 && color == "blue";
	//test our boolean
		
	if (largeandblue)	
	{
		System.out.println("largeandblue="+largeandblue);
			
	}
	else
	{
		System.out.println("largeandblue=false");	
	}
	
	}

}
