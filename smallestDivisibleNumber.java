// { Driver Code Starts
import java.util.*;
class SDN{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			GfG g=new GfG();
			System.out.println(g.getSmallestDivNum(n));
		}
	}
}// } Driver Code Ends


/*Complete the Given Function*/
class GfG{
	public static long getSmallestDivNum(int n){
long s=1;
	    
	    for(long i =2;i<=n;i++)
	    {
	        s = lcm(s,i);
	    }
	    
	    return s ;

}

public static long gcd(long a,long b)
{
    if(b==0)
    return a ;
    else
    return gcd(b,a%b);
}

public static long lcm(long a,long b)
{
    return (a*b)/gcd(a,b);
}
}
