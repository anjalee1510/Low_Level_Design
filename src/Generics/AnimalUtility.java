package Generics;

import java.util.List;

public class AnimalUtility {
//	public static void printAnimalNames(List<Animal> animals){
//		{
//		animals.add(new Dog(" "));	
//		for(Animal animal:animals) {
//			System.out.println(animal.name);
//		}
//	}
//		
//	}
	
	//public static <T extends Animal> void printAnimalNames(List<T> animals) {
	public static void printAnimalNames(List<? extends Animal> animals) {
		 //animals.add(new Dog("");// This line not allowed
		for(Animal animal:animals) {
			System.out.println(animal.name);
		}
		//As soon as we use extends with Generics Variable we can not modify the List
	}
}
