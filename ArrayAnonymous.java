package com.java;

public class ArrayAnonymous {
static void print(int arr[]) {//static print method receives an array an a anonymous argument
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	
}
public static void main(String args[]) {
	print(new int[] {1,2,3,4,5,6,7,8,9});//passing anonymous array to method
}
}
