package designMemento;

public class Originator {

	    private String content;

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public String getContent() {
	        return content;
	    }

	    public Memento createMemento() {
	        return new Memento(content);
	    }

	    public void restoreFromMemento(Memento memento) {
	        content = memento.getContent();
	    }
}
