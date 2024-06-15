package Builder.V3;

public class Client {
	public static void main(String[] args) {
		
		//StudentBuilder sb=new StudentBuilder();			
		//StudentBuilder sb=Student.getBuilder();// static method
//		sb.setAge(25);
//		sb.setBatch("Apr23");
//		sb.setGradYear(2025);
//		
		Student s=Student.getBuilder()
		.setAge(30)
		.setGradYear(2025)
		.setBatch("Apr23")
		.setName("Anjalee")
		.build();
		
	//	sb1.build();
	//	Student s=new Student(sb); // We have to stop the client
		//from using this method. We can declare the constructor as private
	}
	

}
