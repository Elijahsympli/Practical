package com.pack;
//single Inheritance
class Vehicle{//parent class A
	void running() {
		System.out.println("running mode on");
	}
}
class Bike extends Vehicle{//child class B
	void run() {
		System.out.println("Bike run mode on");
	}
}
public class Vehicle1 {
	public static void main(String args[]) {
		Bike d=new Bike();//object of the child class bike
		d.run();//child class method
		
		d.running();//parent class method
	}
}
