import java.io.*;
import java.util.*;


class Guvi_number_power_11
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num,pw,p;
		
		num=sc.nextInt();
		
		p=sc.nextInt();
		
		pw=(int)(Math.pow(num,p));
		
		System.out.println(pw);
	}
}