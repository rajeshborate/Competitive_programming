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
		
		for(int i=0;i<n;i++){
		    char c=sc.next().charAt(0);
		    switch(c){
		        case 'B':
		        case 'b':
		            System.out.println("BattleShip");
		            break;
		        case 'C':
		        case 'c':
		            System.out.println("Cruiser");
		            break;
		        case 'D':
		        case 'd':
		            System.out.println("Destroyer");
		            break;
		        default:
		            System.out.println("Frigate");
		            break;
		    }
		}
	}
}
