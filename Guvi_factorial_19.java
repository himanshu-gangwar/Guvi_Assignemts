import java.io.*;
import java.util.*;

class Guvi_factorial_19
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num,fact,i;
		
		num=sc.nextInt();

		fact=1;

		
		for(i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}