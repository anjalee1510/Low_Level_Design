package Builder.V1;

public class Client {
	public static void main(String[] args) {
		
		//StudentBuilder sb=new StudentBuilder();			
	//	StudentBuilder sb=Student.getBuilder();// static method
//		sb.setAge(25);
//		sb.setBatch("Apr23");
//		sb.setGradYear(2025);
//		
		StudentBuilder sb=Student.getBuilder()
		.setAge(0)
		.setGradYear(2025)
		.setBatch("Apr23")
		.setName("Anjalee");
		
	//	sb1.build();
		Student s=new Student(sb);// If we want to stop the client
	//	from using this line, we need to make the constructor private
	}
	

}
