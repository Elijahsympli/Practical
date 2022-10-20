package com.java;
abstract class Test{//abstract class parent class
	
	abstract void display();//abstract method
void show() {
	System.out.println("non abstract method invoked");
}
}
 class AbstractClass extends Test {
	void display() {//non abstract method with same name
		System.out.println("Display method invoked");
	}
	class demo1  extends Test{
		void display() {
			System.out.println("demo1 method invoked");
		}
	}
public static void main(String args[]) {
	Test obj=new AbstractClass();//upcasting
	Test obj1=new AbstractClass();
	obj.display();
	obj1.display();
	obj.show();
}

}
