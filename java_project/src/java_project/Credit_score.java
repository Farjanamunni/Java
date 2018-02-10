package java_project;

public class Credit_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double score1 = 80;
	double score2 = 60;
	double score3 = 40;
	double average = (score1+score2+score3)/3;
		
	{	
	System.out.println("Average score "+average );
		}	
	if (score1>average)	{
		System.out.println("Credit score1 "+score1 +" is  excellent" );
	}
	else {
		System.out.println("Credit score1 "+score1 +" is  low" );
	}
	
	if (score2<average || score2==average);
	{
		System.out.println("Credit score2 "+score2 +" is  good" );	
	}
	
	if (score3<average) 
		{
			System.out.println("Credit score3 "+score3 +" is  low" );	
		}
		else
		{
			System.out.println("Credit score3 "+score3 +" is  good" );
		}
		
		
		
	}

}
