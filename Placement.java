package sample_project;
import java.util.Scanner;
public class Placement{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        byte num1 = obj.nextByte();
        System.out.println("Enter the no of students placed in ECE:");
        byte num2 = obj.nextByte();
        System.out.println("Enter the number of students placed in MECH:");
        byte num3 = obj.nextByte();
        if ((num1|num2|num3) < 0)
            System.out.println("Input is Invalid");
        else if ((num1 == num2)&(num1 == num3)&(num2==num3) )
                 System.out.println("None of the department has got the highest placement");
        else if ((num1>=num2)&(num1>=num3)) {
        	      System.out.println("Highest Placement");
        	      System.out.println("CSE");
        	         if ((num1==num2))
    	    	   System.out.println("ECE");
    	              if ((num1==num3))
    	    	   System.out.println("MECH");
                 }
        else if ((num2>=num1)&(num2>=num3)) {
        	      System.out.println("Highest Placement");
               	  System.out.println("ECE");
        	         if ((num2==num1))
        	    	   System.out.println("CSE");
        	        if ((num2==num3))
        	    	   System.out.println("MECH");
                 }
        else {
        	           System.out.println("Highest Placement");
        	           System.out.println("MECH");
                     }
        	    
             
    }
}