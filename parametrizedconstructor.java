package com.pack;

public class parametrizedconstructor {
int age;
String name;
//parametrized cons where we have to pass parameter or argument
parametrizedconstructor (int a,String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+" "+name);
}
public static void main(String args[]) {
	parametrizedconstructor  d=new parametrizedconstructor (50,"karan");
	parametrizedconstructor  d1=new parametrizedconstructor (25,"rohit");
	d.show();
	d1.show();
	
}
}
