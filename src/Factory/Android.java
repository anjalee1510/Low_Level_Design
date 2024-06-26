package Factory;

import Factory.components.Button.Button;

public class Android extends Platform{

	

	@Override
	public UIComponentFactory CreateUIComponentFactory() {
		// TODO Auto-generated method stub
		return new AndroidComponentFactory();
	}

}
