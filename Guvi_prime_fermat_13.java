import java.io.*;
import java.util.*;

class Guvi_prime_fermat_13
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		long pw,fer;
		
		num=sc.nextInt();
		
		pw=(long)(Math.pow(2,num));
		
		fer=pw-2;
		
		if(fer%num==0)
			System.out.println("No. is Prime");
		else
			System.out.println("No. is not Prime");
	}
}