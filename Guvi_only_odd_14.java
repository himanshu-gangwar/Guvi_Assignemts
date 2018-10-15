import java.io.*;
import java.util.*;

class Guvi_only_odd_14
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int sr,er,i;
		
		sr=sc.nextInt();
		er=sc.nextInt();

		
		for(i=sr;i<=er;i++)
		{
			if(i%2==0)
				continue;
			else
				System.out.print(i+" ");
		}
		
	System.out.println();

	}
}