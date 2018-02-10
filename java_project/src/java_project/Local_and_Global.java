package java_project;

public class Local_and_Global {
static int c= 6000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(c);// global variable can be used in any function
		salary();
		DreamSalary();
	
	
}
 
	  static void salary() // local variable is only local to the function, and only can be used inside that function.
	  {
	int a=7000;
	System.out.println(a);
	//System.out.println(c);
	System.out.println(a+c);
	}
	public static void DreamSalary()
	{
		
		int b=10000;
		System.out.println(b);
		//System.out.println(c);
		System.out.println(b+c);
	}
	
		
	
}
