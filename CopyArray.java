package com.java;

public class CopyArray {//class
public static void main(String args[]) {
	//declaring a source array
	char []copyFrom= {'d','e','c','g','h','e','i','n'};
	////declaring a distination array
	char []copyTo=new char[6];
	System.arraycopy(copyFrom, 4, copyTo, 0,4);
	//print the destination array
	System.out.println(String.valueOf(copyTo));
}
}
