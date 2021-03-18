package sample_project;
public class GradingApplication {
	public static void main(String args[]){
		int phy=80;
		int mat=50;
		int che=60;
		if (phy>=35&&mat>=35&&che>=35) {
			
			double avg=(phy+che+mat)/3;
			if (avg<=59)
				System.out.println(" Grade c");
			else if (avg<=69)
				System.out.println("Grade B");
			else
				System.out.println("Grade A");
		
		}
		else {
			
			System.out.println("Failed");
		} 
			
	}
}
			
			
		
		
		
		
		
		
		
		
		
		

