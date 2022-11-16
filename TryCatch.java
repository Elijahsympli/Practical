package ExceptionHandle;

public class TryCatch {
public static void main(String args[]) {
	try {
		int num=25/0;//may exception occur
		System.out.println("Result");//if exception not occur then this line will executeas
		
	}//catch (ArithmeticException r)//handling exception
	catch(Exception e) {
		System.out.println("number can't divided by zero");
	
		System.out.println(e);
}
}
}
