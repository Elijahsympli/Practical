package com.java;



public class ArrayPassingToMethod {
//creating a method which pass an array as a parameters
	static void maximumNo(int array[]) {
	int max=array[0];
	for(int i=1;i<array.length;i++)
		if(max<array[i])
			max=array[i];
	System.out.println(max);
}
		
		public static void main(String args[]) {
//declaring & initializing array
			int a[]= {3,4,5,6,2,1};
			maximumNo(a);//passing array to a method
		}
}
