/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=1;j<=T;j++)
		{
		   int A=sc.nextInt();
		   int B=sc.nextInt();
		  int i,bc,lc;
		  bc=0;
		  lc=0;
		  int c=0;
		  for(i=1;;i++)
		  {
		      if(i%2==0)
		      {
		        bc+=i;
		        if(bc>B)
		        {
		            c=1;
		            break;
		        }
		        
		      }
		      else {
		             lc+=i;
		             if(lc>A)
		             {
		                 c=2;
		                 break;
		             }
		      }
		  }
		      if(c==1)
		      {
		          System.out.println("Limak");
		      }
		          else
		          {
		          System.out.println("Bob");
		      }
		  
		   
		}
	}
}
