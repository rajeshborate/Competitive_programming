/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0; i<x;i++)
        {
            int a=sc.nextInt();
            int s=0;
            while(a>0)
            {
                s=s+a%10;
                a=a/10;
            }
            System.out.println(s);
        }
	}
}
