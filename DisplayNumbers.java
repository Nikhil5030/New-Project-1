package sample_project;
import java.util.Scanner;
public class DisplayNumbers {

	public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      byte num=obj.nextByte();
      for (int i=1;i<=num;i++) {
    	  if (i%10==0) {
    		   continue;	   
    	  }
    	  else if(i>100)
    		  break;
    	  else  
    	  System.out.println(i);       	  
	}
     int i=1;
      while (i<=num) {
    	  if (i%10 ==0) {
    		  i=i+1;
    		  continue;}
    	  else if(i>100)
    		  break;
    	  else 
    		  System.out.println(i);
      i=i+1;  
       
      }
       
     /* int i=1;
      do {
    	  if (i%10 ==0) {
    		  i=i+1;
    		  continue;}
    	  else if(i>100)
    		  break;
    	  else 
    		  System.out.println(i);
      i=i+1;  
    	  
      }while(i<=num);*/
	}
}
