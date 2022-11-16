package ExceptionHandle;
//under the throwable class user defined exception using throw keyword

public class UserDefinedException{
	public static void main(String args[]) {
		try {
			throw new UserDefinedException1("user defined exception");
			
		}
		catch(UserDefinedException1 u) {
			System.out.println("exception mil gaya");
			System.out.println(u.getMessage());
		}
		}
	}

