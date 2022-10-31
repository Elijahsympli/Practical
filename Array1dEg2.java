package com.java;

public class Array1dEg2 {
public static void main(String args[]) {
	int a[]=new int[5];//declaration & instantiation
	//initialization
	a[0]=2;
	a[1]=1;
	a[2]=3;
	a[3]=6;
	a[4]=7;
	//  int a[]={2,1,3,6,7}; //another way of initialize an array
	//if index is more than five it will give run time error out of bounds
	//traversing(simply printing) an array
	for(int i:a)
	//for(int i=0;i<a.length;i++)//length is one of the property of an array
	System.out.println(a[i]);
	
	
}
}
