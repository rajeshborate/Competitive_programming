// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with countOddEven() as its member function
* a : input array
* n : size of array
*/
class Geeks{
    static void countOddEven(int a[], int n){
        
        int odd = 0, even = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] %2 == 0)
                even++;
            else
                odd++;
        }
        
        System.out.printf("%d %d", odd, even);
        System.out.println();
        
        
    }
}

// { Driver Code Starts.


class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.countOddEven(a, sizeof_array);
		}
		
	}
}
  // } Driver Code Ends
