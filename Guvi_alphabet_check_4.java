import java.io.*;
import java.util.*;

class Guvi_alphabet_check_4
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		char c;
		
		c=sc.next().charAt(0);
		
		if(((c>=97)&&(c<=122))||((c>=65)&&(c<=90)))
			System.out.println("Alphabet");
		else
			System.out.println("Invalid Input");
		
	}
}