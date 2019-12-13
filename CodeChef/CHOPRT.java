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
		
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    if(a>b){
		        System.out.println(">");
		    }
		    else if(a<b){
		        System.out.println("<");
		    }
		    else{
		        System.out.println("=");
		    }
		}
	}
}
