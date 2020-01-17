
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-- > 0){
		    int n=s.nextInt();
		    int d=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }
		    StringBuffer sb=new StringBuffer();
		    for(int i=d;i<n;i++){
		        sb.append(a[i]+" ");
		    }
		    for(int i=0;i<d;i++){
		        sb.append(a[i]+" ");
		    }
		    System.out.println(sb);
		}
	}
}
