package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IosButton;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Dropdown.IosDropdown;
import Factory.components.Menu.IosMenu;
import Factory.components.Menu.Menus;

public class IosComponentFactory implements UIComponentFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IosButton();
	}

	@Override
	public Dropdown createDropdown() {
		// TODO Auto-generated method stub
		return new IosDropdown();
	}

	@Override
	public Menus createMenu() {
		// TODO Auto-generated method stub
		return new IosMenu();
	}

}
