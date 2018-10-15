import java.io.*;
import java.util.*;

class Guvi_palindrome_12
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num,copy,rem,rno;
		rno=0;
		
		num=sc.nextInt();
		
		copy=num;
		
		while(num!=0)
		{
			rem=num%10;
			rno=rno*10+rem;
			num/=10;
		
		}
		
		if(copy==rno)
			System.out.println("No. is Palindrome");
		else
			System.out.println("No. is not a Palindrome");
	}
}