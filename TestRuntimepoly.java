package com.java;
//runtime polymorphism-- method overriding
class Runtimepoly{
	int value =50;//data  member
	void show() {//parent class method
		System.out.println("show anything");
	}
}



public class TestRuntimepoly extends Runtimepoly{
	int value=70;//we cannot over ride data member
	void show() {//method override
		System.out.println("show nothing");
	}
	//reference variable of parent class refers to the object of child class
public static void main(String args[]) {
	Runtimepoly obj=new TestRuntimepoly();//upcasting
	obj.show();
	System.out.println("value is:"+obj.value);
}
}
