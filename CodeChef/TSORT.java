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
		int[] array=new int[n];
		for(int i=0;i<array.length;i++){
		    array[i]=sc.nextInt();
		}
		
		Arrays.sort(array);
		for(int k=0;k<array.length;k++){
		    System.out.println(array[k]);
		}
	}
}
