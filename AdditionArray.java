package com.java;

public class AdditionArray {

	public static void main(String[] args) {
		//creating matrix
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{2,2,3},{4,7,6}};
//for storing result creating another matrix
		int c[][]= new int[2][3];
		//logic and printing
		for(int i=0;i<2;i++) {//printing row
			for(int j=0;j<3;j++) {//printing column
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
