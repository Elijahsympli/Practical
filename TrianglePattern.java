//WAP to draw a pattern
/*
    *
   * *
  * * *
 * * * *

*/
package com.pack;

public class TrianglePattern {
	public static void printTriangle(int n) {
		//outer loop to handle no. of rows,n in this case
		for(int i=0;i<=n;i++) {//outer for loop
			//inner loop to handle number spaces
			for(int j=n-i;j>=1;j--) {//inner for loop
				System.out.print(" ");
			}//inner loop to handle no. of columns
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}//ending line after each row
			System.out.println();
		}
	}
public static void main(String args[]) {
	
int n=5;
printTriangle(n);//calling method
}
}
/*
 sss*sss
 ss*s*ss
 s*s*s*s
 *s*s*s*

*/