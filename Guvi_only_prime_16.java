import java.io.*;
import java.util.*;

class Guvi_only_prime_16
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int sr,er,i,pw,fer;
		
		sr=sc.nextInt();
		er=sc.nextInt();

		
		for(i=sr;i<=er;i++)
		{
			pw=(int)(Math.pow(2,i));
		
			fer=pw-2;
		
			if(fer%num==0)
				System.out.println(i+" ");
			else
				continue;
		}
		
		System.out.println();
	}
}