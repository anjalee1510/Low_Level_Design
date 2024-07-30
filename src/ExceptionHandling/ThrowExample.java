package ExceptionHandling;

public class ThrowExample {
	public static void main(String[] args) {
		try {
			validateAge(15);
		}catch(InvalidAgeException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	static void validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
		System.out.println("Valid age");
	}

}
