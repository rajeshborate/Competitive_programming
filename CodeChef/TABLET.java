/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int b =sc.nextInt();
		    
		    int highest=0;
		    int high = 0;
		    while(n-->0){
		        int w=sc.nextInt();
		        int h=sc.nextInt();
		        int p=sc.nextInt();
		        
		        if(b>=p){
		            highest = w*h;
		        }
		        
		        if(highest > high)
		            high =highest;
		        
		    }
		    if(high == 0)
		        System.out.println("no tablet");
		    else 
		        System.out.println(high);
		}
		
		
	}
}
