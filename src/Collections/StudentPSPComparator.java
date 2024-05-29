package Collections;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//o1: win return -1
		//o2: win return 1
		if(o1.psp<o2.psp) {
			return -1;
		}
		else if(o1.psp>o2.psp) {
			return 1;
		}
		return 0;
	}
	
}
