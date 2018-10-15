import java.io.*;
import java.util.*;

class Guvi_only_prime_16
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int sr,er,i;
		
		long pw,fer;
		
		sr=sc.nextInt();
		er=sc.nextInt();

		
		for(i=sr;i<=er;i++)
		{
			pw=(long)(Math.pow(2,i));
		
			fer=pw-2;
		
			if(fer%i==0)
				System.out.print(i+" ");
			else
				continue;
		}
		
		System.out.println();
	}
}