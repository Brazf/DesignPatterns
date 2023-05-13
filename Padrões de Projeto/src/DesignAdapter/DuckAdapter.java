package DesignAdapter;

public class DuckAdapter implements Turkey{

	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void gobble() {
		duck.Quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
