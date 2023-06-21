package respostaObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneModel {
	private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    // Método para adicionar observadores
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Método para notificar todos os observadores
    private void notifyObservers(int newDigit) {
        for (Observer observer : observers) {
            observer.notificacao(newDigit);
        }
    }
}