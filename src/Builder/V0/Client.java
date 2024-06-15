package Builder.V0;

public class Client {
	public static void main(String[] args) {
		
		StudentBuilder sb=new StudentBuilder();			
		sb.setAge(25);
		sb.setBatch("Apr23");
		sb.setGradYear(2025);
		
		Student s=new Student(sb);
	}
	

}
