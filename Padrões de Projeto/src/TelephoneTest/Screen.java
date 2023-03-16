package TelephoneTest;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen implements Observer{
	
	public void update(String digit) {
        System.out.println(digit);
    }
	
}