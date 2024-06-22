package ProtoypeAndRegistory;

import java.util.Map;

public class StudentRegistry {
	private Map<String, Student> students;
	public void register(String key,Student st) {
		students.put(key, st);
	}
	public Student get(String key) {
		return students.get(key).copy();// sending the copy as if we sentd the actual prototype it might get modified
	}
}
