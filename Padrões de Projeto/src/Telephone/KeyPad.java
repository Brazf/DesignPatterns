package Telephone;
import java.util.Random;


public class KeyPad {
	/**
	 * Mimic the data input ability of a physical phone's keypad;
	 * however, here we're just sending it fake digits.
	 */
	
	    private final PhoneModel model;

	    public KeyPad(PhoneModel model) {
	        this.model = model;
	    }

	    public void simulateKeyPresses(int numKeyPresses) {
	        final int MAX_DIGIT = 12;
	        Random rnd = new Random();
	        for (int i = 0; i < numKeyPresses; i++) {
	            int newDigit = rnd.nextInt(MAX_DIGIT);
	            System.out.println("Pressing: " + newDigit);
	            model.addDigit(newDigit);
	            }
	        }

}
