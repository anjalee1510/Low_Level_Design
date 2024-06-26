package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.Dropdown.AndroidDropdown;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.AndroidMenu;
import Factory.components.Menu.Menus;

public class AndroidComponentFactory implements UIComponentFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public Dropdown createDropdown() {
		
		return new AndroidDropdown();
	}

	@Override
	public Menus createMenu() {
		return new AndroidMenu();
	}

}
