/*
Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 

Input:
The first line of input contains an integer, the number of test cases T. Each test case should contain a positive integer N.

Output:
Print the sum in a separate line.

Constraints:
1 <= T <= 30
1 <= N <= 100

Example:
Input:
2
1
5

Output:
1
15

Explanation:
Testcase 2: For n=5 , sum will be 1+2+3+4+5=15.

*/



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int sum=0;
		    for(int j=1;j<=a;j++){
		        sum+=j;
		    }
		    System.out.println(sum);
		}
	}
}
