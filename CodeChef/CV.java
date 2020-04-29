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
		    String s = sc.next();
		    int count =0;
		    
		    for(int i=1;i<s.length();i++){
		        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
		            if(s.charAt(i-1) != 'a' && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'i' && s.charAt(i-1) != 'o' && s.charAt(i-1) != 'u'){
		                count++;
		            }
		            
		        
		    }
		    
		    }
		    System.out.println(count);
		}
		
	}
}
