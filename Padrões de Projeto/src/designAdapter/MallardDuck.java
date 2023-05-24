package designAdapter;

public class MallardDuck implements Duck{

	@Override
	public void Quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
