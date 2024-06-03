package ExceptionHandling;

public class Student {
 static int doSomething(int x) throws ClassNotFoundException,RandomException {
	if(x==0) {
		throw new ArithmeticException();
	}else if(x%2==0) {
		throw new ClassNotFoundException();
	}
	else if(x%5==0) {
		throw new RandomException();
	}
	 return 1/x;
 }

	
}

