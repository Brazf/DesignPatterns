package DesignFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare () {
		System.out.println("Preparing"+ name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		
	}
	void bake () {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut () {
		System.out.println("Cutting the pizza into diaginal slices");
	}

	void box() {
		System.out.println("Place pizzza in official PizzaStore box");
	}
	public String getName () {
		return name;
	}
}
