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
		    switch(a){
		        case(2010):
		        case(2015):
		        case(2016):
		        case(2017):
		        case(2019):
		            System.out.println("HOSTED");
		            break;
		        default:
		            System.out.println("NOT HOSTED");
		    }
		    
		}
	}
}
