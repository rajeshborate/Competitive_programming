// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    Divisors obj=new Divisors();
		    int N;
		    N=sc.nextInt();
		    
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends
//User function Template for Java


class Divisors
{
    
    public int exactly3Divisors(int N)
        {
            //Your code here

            int count = 1;

            if(N <= 3){
                return 0;
            }

            for(int i = 3; i <= Math.sqrt(N); i++ ){

                if(isPrime(i) && (i * i) <= N){
                    count++;
                }
            }
            
            return count;
        }

private boolean isPrime(int n){

    int limit = (int)Math.sqrt(n);

    for(int i = 2; i <= limit; i++){

        if(n % i == 0){
            return false;
        }
    }
    return true;
    }
}
