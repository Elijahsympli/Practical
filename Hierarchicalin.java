//Hierarchical Inheritance
package com.pack;

class Vehicle3{//parent class A
	void running() {
		System.out.println("running mode on");
	}
}
class Carl3 extends Vehicle3{//child class C
	void run() {
		System.out.println("car run mode on");
	}
}
class Bike3 extends Vehicle3{//child class C
	void Speed() {
		System.out.println("speed is very high");
	}
}


public class Hierarchicalin {
public static void main(String args[]) {
	Bike3 b= new Bike3();
	b.running();
	b.Speed();
	Carl3 c=new Carl3();
	c.running();
	c.run();
}
}
