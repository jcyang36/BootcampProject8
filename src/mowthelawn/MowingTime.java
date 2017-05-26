package mowthelawn;

import java.util.Scanner;

public class MowingTime
{
    public static void main( String[] args)
   {
    	System.out.println("Enter the length of the lawn: ");
		Scanner scannerInput=new Scanner(System.in);
		float len = scannerInput.nextFloat();
		System.out.println("Enter the width of the lawn: ");
		scannerInput=new Scanner(System.in);
		float wid=scannerInput.nextFloat();
		System.out.println("The length is "+len +" yards");
		System.out.println("The width is "+wid +" yards");
		System.out.println("The square yardage is "+len*wid+ " square yards");
		float remainder=(len*wid /20) % 60;
		int intHours=(int) (len*wid/1200);
		
		
		System.out.println("The time it takes is "+len*wid/20 +" minutes.  The time in hours is " +intHours+" hours and "+remainder+" minutes.");
		
       
		
    }
}
