package Decorator;

public class DarkRoast implements Beverage
{

	@Override
	public void getDesc() {
			System.out.println("DarkRoast :"+getCost());
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 150;
	}

}
