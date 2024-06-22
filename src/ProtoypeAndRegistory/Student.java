package ProtoypeAndRegistory;

public class Student implements Prototype{
	int id;
	String name;
	String batch;
	Student(){
		
	}
	
	Student(Student st){
		this.id=st.id;
		this.name=st.name;
		this.batch=st.batch;
	}
	
	public Student copy() {
		Student st=new Student(this);
		st.id=this.id;
		st.name=this.name;
		st.batch=this.batch;
		
		return st;
	}
}
