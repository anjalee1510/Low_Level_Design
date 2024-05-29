package Collections;

public class Student implements Comparable<Student>{
	int age;
	double psp;
	String name;
	double attendance;
	public Student(int age, double psp, String name, double attendance) {
		this.age = age;
		this.psp = psp;
		this.name = name;
		this.attendance = attendance;
	}
	//Desc order of age
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//this object : comes first return -1
		//other object : comes first return 1
		// return 0
		if(this.age>o.age) {
			return -1;
		}
		else if(this.age<o.age) {
			return 1;
		}
		return 0;
	}
	
	

}
