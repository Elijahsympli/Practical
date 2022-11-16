package String;
//append() insert() replace() delete() reversee()-mutable class(String builder and buffer)
public class MutableEg {
	public static void my() {
	
	StringBuffer s=new StringBuffer("hello");//object of String buffer class
	s.append("world");//Hello world
	System.out.println("String is: "+s);//Hello world
	s.insert(2, "riya");//(int off set,sting s
	System.out.println("insert is: "+s);
	s.replace(1,3,"java");//(beginwith,endswith,string s)
	System.out.println("replace is: "+s);
	System.out.println("capasity is : "+s.capacity());
	//String Builder
	StringBuilder s1=new StringBuilder("world");
	s1.replace(1,3,"java");
	System.out.println("replace is : "+s1);
	s1.delete(1, 3);
	System.out.println("delete is : "+s1);
	s1.reverse();
	System.out.println("reverse is : "+s1);
	
}
	public static void main(String args[]) {
		my();
		
	}
}