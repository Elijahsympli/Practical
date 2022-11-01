package com.java;
//Multidimensional array
public class Array2D {
public static void main(String args[]) {
	//declaring & initializing 2D array
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<3;i++) {//for row
		for(int j=0;j<3;j++) {//for column
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();
}
}
}
