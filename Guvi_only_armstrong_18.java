import java.io.*;
import java.util.*;

class Guvi_only_armstrong_18
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int sr,er,copy,rem,armno,i,num;
		
		sr=sc.nextInt();
		er=sc.nextInt();

		for(i=sr+1;i<er;i++)
		{
			armno=0;
			num=i;
			
			while(num!=0)
			{
				rem=num%10;
				armno=armno+(rem*rem*rem);
				num/=10;
			
			}
			
			if(i==armno)
				System.out.println(i+" ");
			else
				continue;
		}

	}
}
