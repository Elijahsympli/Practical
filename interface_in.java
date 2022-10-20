package com.java;

interface Multiple_1In {
void show();

}
interface Multiple_1In1{
	void show();
}
class interface_in implements Multiple_1In,Multiple_1In1{
	
		public void show() {
			System.out.println("Hi");	
			}
		
		public static void main(String args[]) {
			interface_in obj=new interface_in();
		obj.show();
		
		}
	
}

