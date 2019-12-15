/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0; i<t; i++){

      System.out.println(factorial(sc.nextInt()));
    }

 }


  public static BigInteger factorial(Integer x){
    BigInteger ONE = new BigInteger("1");

    if(x==0) return ONE;
    return factorial(x-1).multiply(BigInteger.valueOf(x.intValue()));
  }
}
