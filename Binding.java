package com.java;
//understading type--1.variable type--int a=50
//2.reference type -- class bank 
//main method
//bank obj;//bank reference
//object type--bank obj=new bank();
 class Binding {
	private void display() {//static binding private,final,static
		System.out.println("samjhe??");
	}
	void show() {
		System.out.println("ab samjhe???");
	}
	public static void main(String args[]) {
		Binding obj =new Binding();
		obj.display();//object type
		
	}

}
