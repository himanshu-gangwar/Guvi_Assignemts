import java.io.*;
import java.util.*;

class Guvi_leap_year_6
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int year;
		
		year=sc.nextInt();
		
		if(year<0)
			System.out.println("Not a valid year");
		
		else if(year%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap Year");
		
	}
}