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
		double tot,dis;
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(a>1000){
		        tot=(double)a*b;
		        dis=0.1*tot;
		        System.out.printf("%.6f",tot-dis);
		        System.out.println("");
		    }
		    else{
		        tot=a*b;
		        System.out.printf("%.6f",tot);
		        		        System.out.println("");

		    }
		}
	}
}
