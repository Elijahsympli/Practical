package com.java;
 interface Multiple_In {
void show();
}
interface Multiple_In1{
	void display();
}
class MultipleInheritance implements Multiple_In,Multiple_In1{
	
		public void show() {
			System.out.println("Hi");	
			}
		public void display() {
			System.out.println("hello");
		}
		public static void main(String args[]) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.show();
		obj.display();
		}
	
}