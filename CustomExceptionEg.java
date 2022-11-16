package ExceptionHandle;

public class CustomExceptionEg {
public void checkage(int age)throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("Invalid age");
	}
	else System.out.println("proper age for enrolling in java course");
}
	public static void main(String[] args) throws InvalidAgeException {
CustomExceptionEg obj=new CustomExceptionEg();
obj.checkage(19);
	}

}
