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
		double a=sc.nextInt();
		double b=sc.nextInt();
		char op=sc.next().charAt(0);
		switch(op){
		    case '+':
		        System.out.println(a+b);
		        break;
		    case '-':
		        System.out.println(a-b);
		        break;
		    case '*':
		        System.out.println(a*b);
		        break;
		    case '/':
		        System.out.println(a/b);
		        break;
		}
	}
}
