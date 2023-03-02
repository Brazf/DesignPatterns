package DesignObserver2;

import java.util.ArrayList;
import java.util.List;

public class ServidorCotacao implements iSubject{

	private List<iObserver> observers = new ArrayList<>(); 
	
	public void novaCotacao ( Cotacao cotacao ) {
		notifyObservers ( cotacao );
	}
	
	@Override
	public void registerObserver(iObserver observer) {
		observers.add(observer);
	}
	
	private void notifyObservers ( Cotacao lanceAtual ) {
		observers.forEach ( o -> o.notify( lanceAtual));
	}

}
