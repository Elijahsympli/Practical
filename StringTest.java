package com.java;

import java.util.Scanner;

public class StringTest {

	public void show() {

		Scanner sc=new Scanner(System.in);//user input
		System.out.println("Enter String");//line no 1
		String A=sc.next();//1st string
		String B=sc.next();//2nd string
		System.out.println(A.length()+B.length());//1st string length +(concat) 2nd string
		System.out.println((A.compareTo(B)>0?"yes":"no"));//compare to()
		System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0, 3).toLowerCase()+B.substring(1));

	}
	 public static void main(String[] args) {
	StringTest t=new StringTest();
	t.show();

}
}