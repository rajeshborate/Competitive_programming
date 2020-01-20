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
		int t=sc.nextInt();
		while(t-->0){
		    int r=sc.nextInt();
		    double a,b,c,d,e,f;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    d=sc.nextInt();
		    e=sc.nextInt();
		    f=sc.nextInt();
		    
		    double chef_x,chef_y,head_x,head_y,sous_x,sous_y;
		    chef_x=(double)(c-a)*(c-a);
		    chef_y=(double)(d-b)*(d-b);
		    head_x=(double)(e-c)*(e-c);
		    head_y=(double)(f-d)*(f-d);
		    sous_x=(double)(e-a)*(e-a);
		    sous_y=(double)(f-b)*(f-b);
		    
		    double d1,d2,d3;
		    d1=Math.sqrt(chef_x+chef_y);
		    d2=Math.sqrt(head_x+head_y);
		    d3=Math.sqrt(sous_x+sous_y);
		    
		    if(d1 <= r && d2 <= r){
		        System.out.println("yes");
		    }
		    else if(d2 <= r && d3 <= r || d1<=r && d3<=r){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		    
		    
		    
		}
	}
}
