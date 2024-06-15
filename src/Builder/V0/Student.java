package Builder.V0;

public class Student {
	int age;
	String name;
	String batch;
	int gradYear;
	String course;
	
	Student(StudentBuilder builder){
		if(builder.age>20) {
			throw new IllegalArgumentException("Age must be greater than 20");
		}
		if(builder.gradYear>2024) {
			throw new IllegalArgumentException("Grad Year must be smaller than 2024");
		}
		
		this.age=builder.age;
		this.name=builder.name;
		this.batch=builder.batch;
		this.gradYear=builder.gradYear;
		if(builder.course!= null) {
			this.course=builder.course;
		}else {
			this.course="Academy";
		}
	}

}
