package com.java;
//create object without new keyword
class AnotherClass{//another class
	//data member of another class
	String name;
	int age;
	
}
public class WithoutNew {//class
public static void main(String args[]) {//main method
	try {//creating objects using newInstance method
		AnotherClass o1=AnotherClass.class.newInstance();
		AnotherClass o2=AnotherClass.class.newInstance();
		AnotherClass o3=AnotherClass.class.newInstance();
		AnotherClass o4=AnotherClass.class.newInstance();
		AnotherClass o5=AnotherClass.class.newInstance();
		//initializing data members of objects
		o1.name="a";
		o1.age=20;
		o2.name="s";
		o2.age=21;
		o3.name="d";
		o3.age=22;
		o4.name="f";
		o4.age=23;
		o5.name="g";
		o5.age=24;
		System.out.println("Name"+ "  "+"Age");
		System.out.println(o1.name+"      "+o1.age);
		System.out.println(o2.name+"      "+o2.age);
		System.out.println(o3.name+"      "+o3.age);
		System.out.println(o4.name+"      "+o4.age);
		System.out.println(o5.name+"      "+o5.age);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
