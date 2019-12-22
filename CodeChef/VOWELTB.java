/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c){
		    case 'A':
		    case 'E':
		    case 'I':
		    case 'O':
		    case 'U':
		        System.out.println("Vowel");
		        break;
		    default:
		        System.out.println("Consonant");
		        break;
		}
	}
}
