package SOLID.BirdV4;

public class Vulture extends BirdV3 implements Flyable{
	FlyHigh fh=new FlyHigh(); // tightly coupled
	@Override
	public void fly() {
		// TODO Auto-generated method stub
//		System.out.println("Flying high");
		fh.flyHigh();
		
	}

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
