import java.io.*;
import java.util.*;

class Guvi_only_even_15
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int sr,er,i;
		
		sr=sc.nextInt();
		er=sc.nextInt();

		
		for(i=sr+1;i<er;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
			else
				continue;
		}
		
		System.out.println();
	}
}