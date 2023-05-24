package designCommand;

public class GarageDoorOpenCommand implements iCommand{

	GarageDoor garagedoor;
	
	public GarageDoorOpenCommand(GarageDoor garagedoor) {
		this.garagedoor = garagedoor;
	}
	
	public void execute() {
		garagedoor.up();
		garagedoor.down();
		garagedoor.lightOn();
		garagedoor.stop();
	}

}
