package Decorator;

public class Milk implements AddOn{
	//Milk will be added on already existing Beverage
	Beverage b;
	public Milk(Beverage b) {	
		this.b=b;
	}
	@Override
	public void getDesc() {
		b.getDesc();
		System.out.println("Milk has been added. Milk cost : "+getCost());
	}

	@Override
	public int getCost() {
		return b.getCost()+10;
	}

}
