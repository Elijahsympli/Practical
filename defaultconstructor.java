//display default value
//display default constructor
package com.pack;

public class defaultconstructor {
int age;
String name;
void show() {//method to display age and name
	System.out.println(age+" "+name);
}
public static void main (String args[]) {
	//1st object for age and name
	defaultconstructor dc=new defaultconstructor();
	//2st object for age and name
	defaultconstructor dc2=new defaultconstructor();	
	dc.show();
	dc2.show();
System.out.println(dc.age);
defaultconstructor dc3=new defaultconstructor();	
dc3.age=100;
System.out.println(dc3.age+" "+ dc2.age);

/*defaultconstructor(){//default constructor
System.out .println("Default constructor is created");
}
public static void main(String args[]){
defaultconstructor d=new defaultconstructor();//object creation
}*/
}
}