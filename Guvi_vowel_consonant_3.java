import java.io.*;
import java.util.*;

class Guvi_vowel_consonant_3
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		char c;
		
		c=sc.next().charAt(0);
		
		if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='u')||(c=='o')||(c=='i')||(c=='e')||(c=='a'))
			System.out.println("Vowel");
		
		else if(((c>=97)&&(c<=122))||((c>=65)&&(c<=90)))
			System.out.println("Consonants");
		else
			System.out.println("Invalid Input");
		
	}
}