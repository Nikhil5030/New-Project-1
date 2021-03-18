package sample_project;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    byte n=obj.nextByte();
    boolean primeflag=true;
    for(int i=2;i<n;i++) {
    	if (n%i == 0) {
    		primeflag=false;
    	}
    }
    if (primeflag==true)
    	System.out.println("prime no");
    else
    	System.out.println("Not prime no");
	}

}
