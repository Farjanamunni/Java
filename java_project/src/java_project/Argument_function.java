package java_project;

public class Argument_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum(4,5);

//addition(6,7,8);
//sub(10,5);
	age("texas", 7);	
	}

	//publicstatic void sum()
	public static void sum(int x,int y)
	{
	//int x=2;
	//int y=4;
	
	System.out.println(x+y);
	
	}	
public static void addition(int a,int b,int c)
{
int x= a+b+c;
System.out.println(x);


}	
public static void sub(int x,int y)	
{
	int z= x-y;
System.out.println("The result is "+ z);
}

public static void age(String name,int age)
{
	System.out.println("identity is equal to "+ name + age);	
}


}