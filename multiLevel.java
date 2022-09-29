//multilevel Inheritance
package com.pack;
class  Vehicle2{//parent class A
	void running() {
		System.out.println("running mode");
	}
}
class Bike2 extends Vehicle2{//child class B
	void run() {
		System.out.println("run mode");
	}
}
class Car2 extends Bike2{//child class c
	void speed() {
		System.out.println("speed mode");
	}
}
public class multiLevel {
	public static void main(String args[]) {
		Car2 d=new Car2();//object of child class car
		d.run();//child class method
		d.running();//parent class method
		d.speed();//child class method
	}

}
