package designIterator;

public class DinerMenu {

	static final int MAX_ITENS = 6;
	int numberOfItens = 0;
	MenuItem[] menuItens;
	
	public void addItem (String name, String description, boolean vegatarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegatarian, price);
		if( numberOfItens >= MAX_ITENS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}
		else {
			menuItens[numberOfItens] = menuItem;
			numberOfItens = numberOfItens + 1;
		}
	}
	
	public MenuItem[] getMenuItens() {
		return menuItens;
	}
	
	public Iterator createIterator () {
		return new DinerMenuIterator(menuItens);
	}
	
	
}
