package TelephoneTest;

public class Telephone {

	public static void main(String[] args) {
        Phone phone = new Phone();
        Screen screen = new Screen();
        Dialing dialing = new Dialing();
        phone.attach(screen);
        phone.attach(dialing);

        phone.pressDigit('0');
        phone.pressDigit('8');
        phone.pressDigit('1');
        phone.pressDigit('9');
        phone.pressDigit('9');
        phone.pressDigit('9');
        phone.pressDigit('8');
        phone.pressDigit('8');
        phone.pressDigit('7');
        phone.pressDigit('7');
        phone.pressDigit('6');
        phone.pressDigit('6');
    }
	
}
