package SOLID.BirdV5;

public class Vulture extends BirdV3 implements Flyable{
//	FlyHigh fh=new FlyHigh(); // tightly coupled
//	FlyingBehaviour fh=new FlyHigh();
	// If tomorrow Vulture decides to fly low only 1 modification will be required
//	FlyingBehaviour fh=new FlyLow();
	FlyingBehaviour fh;
	
	//Injecting dependency
	Vulture(FlyingBehaviour fh){
		this.fh=fh;
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
//		System.out.println("Flying high");
//		fh.flyHigh();
		fh.makeFly();
		
	}

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
