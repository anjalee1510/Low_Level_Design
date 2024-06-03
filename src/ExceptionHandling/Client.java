package ExceptionHandling;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException{
		try {
			//put the code which can throw the exception in the try block
			Student.doSomething(0);
		}catch(RandomException r){
			System.out.println("Random exception is caught");
		}
		catch(Exception e) {
			
		}finally {
			//finally block runs irrespective of try and catch
			// close the db connection
		}
	}
}
