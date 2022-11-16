package ExceptionHandle;

public class ExceptionExample {
public void show() {
	String a ="i am error";
	System.out.println(a);
	try {
		int i=50/2;//Arithmetic exception
		System.out.println(i);
		String s="riya";
		System.out.println(s.length());
		int arr[]=new int[3];//new array
		arr[2]=24;//array index out of bound exception
		int m=Integer.parseInt(s);//number format exception
		System.out.println(m);
	
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	String b="i cannot be handle";
	System.out.println(a+" "+b);//i am error +i can not be handle
}
public static void main(String args[]) {
	ExceptionExample ep=new ExceptionExample();
	ep.show();
}
	

}
