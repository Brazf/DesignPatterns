package designCommand;

public class LightOnCommand implements iCommand{
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
