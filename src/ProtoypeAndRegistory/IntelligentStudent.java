package ProtoypeAndRegistory;

public class IntelligentStudent extends Student{
	IntelligentStudent(IntelligentStudent is) {
		super(is);
		this.iq=is.iq;
	}

	int iq;
	
	public IntelligentStudent copy() {
		IntelligentStudent st=new IntelligentStudent(this);
		
		return st;
	}
}
