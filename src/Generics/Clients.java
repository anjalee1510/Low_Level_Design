package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Clients {
	public static void main(String[] args) {
		//All the below objects are valid with different data- types because of Generics
		Pair<Integer , String> p1=new Pair<>();
		p1.doAgain(90.0,75);
		Pair<Integer , String> p2=new Pair<>();
		Pair<String , String> p3=new Pair<>();
		Pair<Integer , Integer> p4=new Pair<>();
		
		p1.setFirst(5);
		
		Integer x=p1.getFirst();
		List<Pair<Integer, String>> list=new ArrayList<>();
		
		// Raw types
		Pair p=new Pair();
		
		//Backward compatibility
		// We shouldn't write the like below
//		HashMap h=new HashMap();
//		h.put("Mohit", 7);
//		h.put(7,"Mohit");
		// both the above line don't show any error but will create issue
		
		//Wrapper classes- Integer,Double, Long - inherit from Object class
		
		//Autoboxing
		int x7=5;
		Integer x5=x7;
		
		String a=Pair.doSomething("Hello");
		
		Pair.dodo();
		
		// Inheritance in Generics
		List<Dog> dogs=new ArrayList<>();
		dogs.add(new Dog("Tobby"));
		dogs.add(new Dog("Tommy"));
		
		
		List<Animal> animals=new ArrayList<>();
		animals.add(new Dog("Bouncy"));
		animals.add(new Dog("Browny"));
		
		AnimalUtility.printAnimalNames(animals);
		//able to pass list of animals
		AnimalUtility.printAnimalNames(dogs);
		//In the above line getting error:
		/*The method printAnimalNames(List<Animal>)
		in the type AnimalUtility is not applicable
		for the arguments (List<Dog>)*/
		
		/*When we apply Generics inheritance i.e. 
		 * T extends Animal then we can supply 
		 * the List of dogs*/
		
	}

}
