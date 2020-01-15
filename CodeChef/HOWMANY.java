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
		int n=sc.nextInt();
		int count=0;
		while(n>0){
		    count++;
		    n=n/10;
		}
		switch(count){
		    case 1:
		        System.out.println("1");
		        break;
		    case 2:
		        System.out.println("2");
		        break;
		    case 3:
		        System.out.println("3");
		        break;
		    default:
		        System.out.println("More than 3 digits");
		}
	}
}
