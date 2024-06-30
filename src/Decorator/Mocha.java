package Decorator;

public class Mocha implements AddOn{
	Beverage b;
	public Mocha(Beverage b) {
		this.b=b;
	}

	@Override
	public void getDesc() {
		b.getDesc();
		System.out.println("Mocha has been added. Mocha :"+getCost());
	}

	@Override
	public int getCost() {
		return b.getCost()+1;
	}

}
