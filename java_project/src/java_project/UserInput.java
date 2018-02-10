package java_project;
import java.util.Scanner; 
public class UserInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

char grade = 'A';
if( grade == 'A' ){
  System.out.println( "Excellent !" );
}
else if(grade == 'B'){
  System.out.println( "Outstanding !" );
}
else if(grade == 'C'){
  System.out.println( "Good !" );
}
else if(grade == 'D'){
  System.out.println( "Can do better" );
}
else if(grade == 'E'){
  System.out.println( "Just passed" );
}
else if(grade == 'F'){
  System.out.println( "You failed" );
}
else{
  System.out.println( "Invalid grade" );
}
	}

}
