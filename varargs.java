package com.java;
//we can take no of arguments
public class varargs {
static void show (String...text) {// using varargs
	System.out.println("show method invoked");
	for(String s:text) {//for each loop
		System.out.println(s);
	}
}
public static void main(String[] args) {
	show();//zero arguments
	show("hi");//one arguments
	show("how","are","you");//one arguments
}
}
