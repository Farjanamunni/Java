package java_project;

public class Assigenment_4_4thfebruary extends Function{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	age (15,40);//overloading
    age( 30);
	
	
		addition();
		name();
		mark();
	}
		public static void name()
		
		{
			System.out.println("My name is king");//override
		}
		
		public static void age(int a, int b)//overloading
		{
			System.out.println("int a*b = "+ a*b );
		}
		
		public static void age(int a )
		{
			System.out.println("int a = "+ a);
		}
	}


