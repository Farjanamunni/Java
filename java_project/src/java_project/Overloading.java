package java_project;

public class Overloading {

	public static void main(String[] args) {//Over loading method has same names but different arguments
		// TODO Auto-generated method stub
numbers(8,9);
numbers(6);
	}
		public static void numbers(int n)	
		
		{
			System.out.println("int n = "+n);
		}
		
		public static void numbers(int n, int p)	
		
		{
			System.out.println("int n*p= "+n*p);
		}
		
		
		
		
	}


