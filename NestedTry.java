package ExceptionHandle;

public class NestedTry {
public static void main(String args[]) {
	try {//outer try block
		try {
			//inner try block 1
			System.out.println("going to divide by 0");
			int b=19/0;
		}
		catch(ArithmeticException e)//catch block of inner try block1
		{
			System.out.println(e);
			int arr[]=new int [5];
		arr[6]=4;//assigning the value out of array bounds
		}
		catch(ArrayIndexOutOfBoundsException ae)//catch block of inner try block2
		{
			System.out.println(ae);
			
		}
		catch(Exception e)//catch block of outer try block
		{
			System.out.println("normal flow..");
			
		}
		
	}finally {
		System.out.println("i am finally block");
	}
}
}
