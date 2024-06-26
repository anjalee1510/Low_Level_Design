package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menus;

public class Client {
	public static void main(String[] args) {
		//Platform p=new Android();
		String platform="Android";
		Platform p=Platform.createPlatform(platform);
		UIComponentFactory uiComponentFactory=p.CreateUIComponentFactory();
		Button button=uiComponentFactory.createButton();
		Menus menu=uiComponentFactory.createMenu();
		Dropdown dropdown=uiComponentFactory.createDropdown();
	}

}
