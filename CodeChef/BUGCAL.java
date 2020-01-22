/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ob=new Scanner(System.in);
	    int T=ob.nextInt();
	    for(int k=0;k<T;k++){
	        int c=0,w=0,i=0;
	        int a=ob.nextInt();
	        int b=ob.nextInt();
		while(a>0||b>0){
			c=(a%10+b%10)%10;
			w+=Math.pow(10,i)*c;
			i++;
			a/=10;
			b/=10;
		}
			System.out.println(w);

		}
	}
}
