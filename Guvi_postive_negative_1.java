import java.io.*;

class Guvi_positive_negative_1
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		num=sc.nextInt();
		
		if(num>0)
			System.out.println("Posistive");
		else if(num==0)
			System.out.println("Zero");
		else
			System.out.println("Negative");
		
	}
}