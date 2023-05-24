package designCommand;

public class SimpleRemoteControl {
	
	iCommand slot;
	
	public SimpleRemoteControl() {};
	
	public void setCommand (iCommand command) {
		slot = command;
	}
	
	public void buttonWasPressed () {
		slot.execute();
	}
}
