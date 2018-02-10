package java_project;

public class Weight_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BMI WEIGHT CALCULATION
	    double weight_kg =55;
		double hight_cm=152;
		double BMI = weight_kg/(hight_cm/100*hight_cm/100);
		
		System.out.println("BMI is " + BMI);
	if (BMI>23.80) {
		
		System.out.println("weight is obese");
		System.out.println("weight is more than "+BMI);
	}	
	else {
	System.out.println("normal");	
		
	}
		
if (BMI<=23.80) {
	
	System.out.println("normal");
	System.out.println(" weight is normal, your BMI IS BMI");
}	
  else {
	System.out.println("obese");		
}

	}

}
