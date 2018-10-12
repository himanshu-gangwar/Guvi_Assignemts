import java.io.*;
import java.util.*;

class Guvi_sum_uptoN_8
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int iter,i,sum=0;
		
		iter=sc.nextInt();
		
		for(i=1;i<=iter;i++)
			sum+=i;
		
		System.out.println(sum);
			
	}
}