package com.java;

import java.util.Scanner;

public class StringEquality {
public static void main(String args[]) {
String str1,str2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first String");
str1=sc.nextLine();

System.out.println("Enter second String");
str2=sc.nextLine();
//comparing two input string
if(str1.equals(str2))
	System.out.println("Equal Strings");
else
	System.out.println("Unequal Strings");
}
}
