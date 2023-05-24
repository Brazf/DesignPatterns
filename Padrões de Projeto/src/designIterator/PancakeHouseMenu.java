package designIterator;

import java.util.List;

public class PancakeHouseMenu {

	List <MenuItem> menuItens;

	public void addItem (String name, String description, boolean vegatarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
		menuItens.add(menuItem);
	}
	
	public List<MenuItem> getManuItens ()
	{
		return menuItens;
	}
	
}
