package java_project;

public class StaticVsNonstatic {
	
static int v= 7000; // static global variable
int g= 400;//Non static value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((v) );
//car();
state();
destination();
// creating an object for food
StaticVsNonstatic x= new StaticVsNonstatic();
x.food();
System.out.println((x.g) );// calling non dtatic global variable
	}
	public static void car()
	{
		System.out.println("i love my honda ");
	}

	public void food()// non static function, we have to create an object
	{
		System.out.println("i dont like meat ");
	}
	
	public static void destination()
	
	{
		System.out.println("i am from texs ");	
	}
	public static void state()
	{
		System.out.println("i am from grorgia ");
	}
}
