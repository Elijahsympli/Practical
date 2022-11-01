package com.java;
//odd numbers of columns known as a jagged array
public class ArrarJagged {
public static void main(String args[]) {
	//declare 2d array
	int arr[][]=new int[3][];//declare no of row =3 but column=blank
	//defining column 5+7+9=21
	arr[0]=new int[5];
	arr[1]=new int[7];
	arr[2]=new int[9];
	//initializing the jagged array
	int count=0;
	for(int i=0;i<arr.length;i++)
		for(int j=0;j<arr[i].length;j++)
			arr[i][j]=count++;
	//print the jagged array
	 for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
	 System.out.println();
}
}
}
