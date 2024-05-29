package Generics;

public class Pair <V,S> {
	V first;
	S second;
	
	
//	Pair<V first, S second>{
//		this.first=first;
//		this.second=second;
//	}
	
	public void setFirst(V first) {
		this.first = first;
	}
	public void setSecond(S second) {
		this.second = second;
	}
	public V getFirst() {
		return first;
	}
	
	public S getSecond() {
		return second;
	}
	// Z will not be taken at the time of object creation.
    // It will be taken at the time of function calling
	public <Z,Y> Z doAgain(Z temp,Y temp2) {
		return temp;
	}
	
// V,S will not be available over here hence below won't work
	// Normal function is written like below
	//public static void doSomething(T first) {
	public static <T> T doSomething(T first){
		return first;
			
	}
	
	public static <T> void dodo() {
		T temp=doSomething(null);
	}
	
}
