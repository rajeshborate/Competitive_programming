/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc= new Scanner(System.in);
		
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		if(x+0.5<=y)
		{
			if(x%5==0)
				System.out.printf("%.2f",y-(x+0.5));
			else
				System.out.printf("%.2f",y);
		}
		else
			System.out.printf("%.2f",y);
	}
}
