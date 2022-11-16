package ExceptionHandle;
//example of throw unchecked exception---runtime
public class ThrowUnchecked {
public static void eligible(int age) {//to checked whether person is eligible to vote or not
	if (age<18) {
		//throw arithmetic exception if person age is <18
		throw new ArithmeticException("you are not eligible to vote");
		
	}
	else 
		System.out.println("person eligible to vote");
	
}
	public static void main(String args[]) {
	eligible(12);
	System.out.println("done");
	}
}
