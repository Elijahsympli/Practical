package com.java;

public class ArrayRtThroughMethod {
static int[]get(){//method which return an array
	return new int[] {1,2,3};

}
public static void main(String args[]) {
int arr[]=get();//calling the same which return an array
for(int i=0;i<arr.length;i++)//print the value of an array
	System.out.println(arr[i]);
}
}
