import java.io.*;
import java.util.*;

class Guvi_number_digit_10
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num,c=0,r;
		
		num=sc.nextInt();
		
		while(num!=0)
		{
			r=num%10;
			c++;
			num/=10;
		
		}
		
		System.out.println(c);
	}
}