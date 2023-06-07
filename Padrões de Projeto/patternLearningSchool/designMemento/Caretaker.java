package designMemento;

import java.util.Stack;

public class Caretaker {

	private final Stack<Memento> mementos = new Stack<>();

    public void backup(Memento memento) {
        mementos.push(memento);
    }

    public Memento restore() {
        return mementos.pop();
    }
    
}
