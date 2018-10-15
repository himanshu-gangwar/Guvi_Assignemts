import java.io.*;
import java.util.*;

class Guvi_armstrong_17
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num,copy,rem,armno;
		armno=0;
		
		num=sc.nextInt();
		copy=num;
		
		while(num!=0)
		{
			rem=num%10;
			armno=armno+(rem*rem*rem);
			num/=10;
		
		}
		
		if(copy==armno)
			System.out.println("No. is Armstrong");
		else
			System.out.println("No. is not Armstrong");
	}
}