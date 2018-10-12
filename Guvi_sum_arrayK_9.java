import java.io.*;
import java.util.*;

class Guvi_sum_arrayK_9
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int K,N,i,sum=0;
		
		N=sc.nextInt();
		K=sc.nextInt();
		
		int arr[] = new int[N];
		
		for(i=0;i<N;i++)
			arr[i]=sc.nextInt();
			

		if(N>=K)
		{
			for(i=0;i<K;i++)
				sum+=arr[i];
		
		System.out.println(sum);
		}

		else
			System.out.println("K should be less than N");
	}
}