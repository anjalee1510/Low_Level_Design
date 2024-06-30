package Decorator;

public class HouseBlend implements Beverage {

	@Override
	public void getDesc() {
		System.out.println("HouseBlend :"+getCost());
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 100;
	}

}
