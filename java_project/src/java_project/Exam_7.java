package java_project;

public class Exam_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //age();
		          classid();
		}
	
		public static void age()
		{
		int age [][]= new int [3] [3];	
		
		age [0][0] = 20;
		age [0][1] = 30;
		age [0][2] = 40;
		
		age [1][0] = 10;
		age [1][1] = 50;
		age [1][2] = 80;
		

		age [2][0] = 90;
		age [2][1] = 54;
		age [2][2] = 60;
		
		int rows= age.length;
		int cols= age[0].length;
		for(int rownum=0;rownum<rows; rownum++) {
		for(int colnum=0;colnum<cols; colnum++)	{
				
			System.out.println(age[rownum][colnum]);	
			}
		}
		}
		public static void classid()	
		{
			int classid[]=new int[4];
			classid[0]=201;
			classid[1]=302;
			classid [2]=405;
			classid [3]=506;
			{
			//System.out.println(age [3]); 
				
				
				for(int x=0; x<classid.length;x++)
					System.out.println(classid [x]); 
				
		}
		}
}
