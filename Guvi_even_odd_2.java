import java.io.*;
import java.util.*;

class Guvi_even_odd_2
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		num=sc.nextInt();
		
		if(num<0)
			System.out.println("Invalid Number");
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}
}