package telephoneTest;

/**
 * Store a phone number, digit-by-digit
 */

public class Phone extends Subject{

	private StringBuilder number = new StringBuilder();

    public void pressDigit(char digit) {
        number.append(digit);
        notifyObservers(Character.toString(digit));
        if (number.length() == 12) {
            System.out.println("Agora discando " + number.toString() + "...");
        }
    }
    
}
