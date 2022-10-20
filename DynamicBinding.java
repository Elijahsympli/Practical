package com.java;


class TestBinding{
	void show() {//Dynamic binding
		System.out.println("ab samjhe??");
	}
}
class DynamicBinding extends TestBinding{
	void show() {
		System.out.println("override");
	}

public static void main(String args[]) {
	TestBinding obj =new DynamicBinding();
	obj.show();//object type
	
}

}
