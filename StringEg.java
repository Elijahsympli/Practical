package String;

public class StringEg {
public void show() {//method
	char []arr= {'j','a','v','a'};//char type array
	String s=new String(arr);
	System.out.println("Value is :"+s);
	System.out.println(arr);
	
}
public void myFunction() {//method 2
String m="pall";
String m1="mamta";
String m2=new String(m1);
System.out.println(m2);
	
}
public static void main(String[] args) {
	StringEg s=new StringEg();
	s.show();
	s.myFunction();
}
}
