package Factory;

public class IOS extends Platform {

	@Override
	public UIComponentFactory CreateUIComponentFactory() {
		// TODO Auto-generated method stub
		return new IosComponentFactory();
	}

}
