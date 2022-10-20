package com.java;

 interface DTest {
void show();
}
class Demo2 implements DTest{
	public void show() {
		System.out.println("hello");
	}
}
	class Demo1 implements DTest{
		public void show() {
			System.out.println("welcome");
		}
	
	public static void main(String args[]) {
	
		DTest obj =new Demo1();
		obj.show();
	}
}