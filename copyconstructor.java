package com.pack;

public class copyconstructor {
int age;
String name;
//constructor & initialize
copyconstructor(int a,String n){
	age=a;
	name=n;
	
}
//constructor to initialize another object
/*copyconstructor(copyconstructor c){
	age=c.age;
	name=c.name;
	
}*/
copyconstructor(){
	
}
void show() {
	System.out.println(age+" "+name);
}
public static void main(String args[]) {
	copyconstructor c1=new copyconstructor(22,"just");
	//copyconstructor c2=new copyconstructor(c1);
	copyconstructor c2=new copyconstructor();
	c2.age=c1.age;
	c2.name=c1.name;
	c1.show();
	c2.show();
}
}
