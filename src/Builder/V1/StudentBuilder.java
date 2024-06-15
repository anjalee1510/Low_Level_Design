package Builder.V1;

public class StudentBuilder {
	int age;
	String name;
	String batch;
	int gradYear;
	String course;
	
	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder setBatch(String batch) {
		this.batch = batch;
		return this;
	}
	public StudentBuilder setGradYear(int gradYear) {
		this.gradYear = gradYear;
		return this;
	}
	
	Student build(){
		if(age>20) {
			throw new IllegalArgumentException("Age must be greater than 20");
		}
		if(gradYear>2024) {
			throw new IllegalArgumentException("Grad Year must be smaller than 2024");
		}
		return new Student(this);
	}
		
}
