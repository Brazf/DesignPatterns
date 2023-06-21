package respostaObserver;

import java.util.List;

public class Screen implements Observer{
	private PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        model.addObserver(this);
    }

    @Override
    public void notificacao(int newDigit) {
        System.out.println("Pressionando: " + newDigit);
        List<Integer> digits = model.getDigits();
        System.out.println(newDigit);
        if (digits.size() > 11) {
            System.out.print("Agora discando ");
            for (int digit : digits) {
                System.out.print(digit);
            }
            System.out.println("...");
        }
    }
}