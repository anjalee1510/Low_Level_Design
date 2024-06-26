package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menus;

public interface UIComponentFactory {
	Button createButton();
	Dropdown createDropdown();
	Menus createMenu();

}
