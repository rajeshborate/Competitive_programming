/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double sal =sc.nextDouble();
		    double gross,hra, da;
		    
		    if(sal < 1500){
		        hra = (float) sal * 0.10;
		        da = (float) sal * 0.90;
		        gross = (float) sal + hra+ da;
		        System.out.println(gross);
		        
		    }
		    else{
		        hra = 500;
		        da = (float) sal * 0.98;
		        gross = (float) sal+ hra +da;
		        
		        System.out.println(gross);
		        
		        
		    }
		    
		    
		}
		
	}
}
