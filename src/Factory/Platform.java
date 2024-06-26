package Factory;

import Factory.components.Button.Button;

public abstract class Platform {
	public void setRefreshRate() {
		
		
	}
	
	public void setTheme() {
		
	}
	
	public static Platform createPlatform(String platformName) {
//		if(platformName.equals("Android")) {
//			return new Android();
//		}
//		else if(platformName.equals("IOS")) {
//			return new IOS();
//		}
//		return null;
		return PlatformFactory.getPlatform(platformName);
	}
	
//	public Button createButton() {
////		if(this is an in instance of Android) {
////			return new AndroidButton();
////		}else if(this is an instance of IOS) {
////			return new IOSButton();
////		}
//	}
	
	//public abstract Button createButton();
/*
 * Now the particular classes have to implement this method
 * But this is not just about the button
 * It is also about the menu
 * It is also about the dropdowns
 * So this will not be enough 
 * Hence, creating another interface*/
	
	public abstract UIComponentFactory CreateUIComponentFactory();
}
