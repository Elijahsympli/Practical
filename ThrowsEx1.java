package ExceptionHandle;

import java.io.IOException;

public class ThrowsEx1 {
void show()throws IOException{
	throw new IOException("throw exception");//checked
}
void display()throws IOException{
	show();
}
void fetch() {
	try {
		display();
	}
	catch (Exception e) {
		System.out.println("exception solved"+e);
	}
}
	public static void main(String[] args) {
		ThrowsEx1 obj =new ThrowsEx1();
		obj.fetch();
		System.out.println("the end");
	}

}
