package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Client {
	public static void main(String[] args) {
	//Collection : container, group of objects
	// List, Set, Queue
	// List: ordered collection : insertion order
	// allows duplicate elements
	//index: inserting, searching, random access
		
		//array, dynamic / growable
		//random access: O(1) using index
		//Not thread safe . not synchronized
		List<String> list=new ArrayList<String>();
		
		//doubly Linked List is used to implement this collection
		// random :O(N)
		//frequent insertion and deletion
		//Not thread safe
		List<String> list1=new LinkedList<>();
		
		//ArrayList + Synchronized (Thread safe)
		//Not frequently used- legacy collection
		//All functions of vectors are Synchronized
		// Synchronized takes a block on the whole object
		// performance not optimized
		List<String> list2=new Vector<>();
		
		// LIFO + thread safe
		//Stack extends from vector
		List<String> list3=new Stack<>();
		
		//Set interface : no duplicate elements are allowed
		// generally not ordered
		//fast searching
		
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2= new LinkedHashSet<>();
		Set<Integer> set3= new TreeSet<>();
		
		set1.add(16);
		set1.add(5);
		set1.add(3);
		set1.add(9);
		set1.add(2);
		
		set2.add(16);
		set2.add(5);
		set2.add(3);
		set2.add(9);
		set2.add(2);
		
		set3.add(16);
		set3.add(5);
		set3.add(3);
		set3.add(9);
		set3.add(2);
		
		//No Order
		//TC: avg O(1)
//		System.out.println(set1);
//		//Insertion Order
//		//TC: avg O(1)
//		//DLL(insertion order) +HashMap(searching) - same structure used in LRU cache
//		System.out.println(set2);
//		//Natural sorting order
//		//TC:O(log2N)
//		//BBST: balanced binary search tree : Red black Tree
//		System.out.println(set3);
		
		//Queue : DS is used to hold item before processing
		// order of processing : FIFO
		
		// Direct implementation is Priority Queue
		
		// Queue is extending  by another interface Deque
		
		Queue<Integer> q= new LinkedList<>();
		//natural sorted order
		Queue<Integer> pq= new PriorityQueue<>();
		pq.add(16);
		pq.add(5);
		pq.add(3);
		pq.add(9);
		pq.add(2);
//		while(!pq.isEmpty()) {
//			System.out.println(pq.peek());
//		}
		
		//Map: key, value
		Map<Integer,String> map=new HashMap<>();
		Map<Integer, String> map2= new LinkedHashMap<>();
		Map<Integer,String> map3=new TreeMap<>();
		Map<Integer,String> map4=new Hashtable<>();
		
		List<Student> list6=new ArrayList<>();
		
		list6.add(new Student(25,65.0,"Rick",77.0));
		list6.add(new Student(21,67.0,"Mick",60.0));
		list6.add(new Student(18,68.0,"John",50.0));
		
		Collections.sort(list6);
		for(Student student : list6) {
			System.out.println(student.name);
		}
		
		Collections.sort(list6,new StudentPSPComparator());
		
		// comparable is used for a single default ordering of any custom class
		// comparator provide multiple custom rules for a single class
		Queue <Student> q1= new PriorityQueue<>(new StudentPSPComparator());
		
	}
}
