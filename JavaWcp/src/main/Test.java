package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
			
		  // 入力
	      int N = sc.nextInt();
	      Long[] A = new Long[N];
	      long B = 0;
	      
	      for(int i = 0; i < N; i++) {
	        A[i] = sc.nextLong();
	      }
	      
	       //出力
	      for(int i = 0; i < N - 1; i++) {
	        if(i == 0) {
	          B = A[i] * A[i + 1];
	          if(A[i] > A[i + 1])
	          	A[i + 1] = gcd(A[i],A[i + 1]);
	          else
	            A[i + 1] = gcd(A[i + 1],A[i]);
	        } else {
	          B *= A[i + 1];
	          A[i + 1] = gcd(A[i],A[i + 1]);
	        }
	        B /= A[i + 1];
	      }
	      System.out.print(B);
		}
	  public static long gcd(long a, long b) {
	    if(b == 0)
	      return a;
	    return gcd(b, a % b);
	  }
}
